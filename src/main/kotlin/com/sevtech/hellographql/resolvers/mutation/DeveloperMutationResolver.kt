package com.sevtech.hellographql.resolvers.mutation

import com.coxautodev.graphql.tools.GraphQLMutationResolver
import com.sevtech.hellographql.model.Developer
import com.sevtech.hellographql.repository.DeveloperRepository
import org.springframework.stereotype.Component
import java.util.*

@Component
class DeveloperMutationResolver(val developerRepository: DeveloperRepository) : GraphQLMutationResolver {

    fun newDeveloper(projectId: String?, name: String, surname: String, email: String): Developer {
        val developer = Developer(UUID.randomUUID().toString(), projectId, name, surname, email)
        return developerRepository.save(developer)
    }

    fun updateDeveloper(id: String, projectId: String?): Developer {
        val developer = developerRepository.findById(id)
        developer.ifPresent {
            it.projectId = projectId
            developerRepository.save(it)
        }
        return developer.get()
    }

    fun deleteDeveloper(id: String): Boolean {
        developerRepository.deleteById(id)
        return true
    }
}