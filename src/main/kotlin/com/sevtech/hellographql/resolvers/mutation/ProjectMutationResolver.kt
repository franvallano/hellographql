package com.sevtech.hellographql.resolvers.mutation

import com.coxautodev.graphql.tools.GraphQLMutationResolver
import com.sevtech.hellographql.model.Project
import com.sevtech.hellographql.repository.DeveloperRepository
import com.sevtech.hellographql.repository.ProjectRepository
import com.sevtech.hellographql.resolvers.query.DeveloperQueryResolver
import org.springframework.stereotype.Component
import java.util.*

@Component
class ProjectMutationResolver(val projectRepository: ProjectRepository) : GraphQLMutationResolver {

    fun newProject(name: String): Project {
        val project = Project(UUID.randomUUID().toString(), name)
        return projectRepository.save(project)
    }

    fun updateProject(id: String, name: String): Project {
        val project = projectRepository.findById(id)
        project.ifPresent {
            it.name = name
            projectRepository.save(it)
        }
        return project.get()
    }

}