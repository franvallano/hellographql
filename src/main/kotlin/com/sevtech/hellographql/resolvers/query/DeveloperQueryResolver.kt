package com.sevtech.hellographql.resolvers.query

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import com.sevtech.hellographql.model.Developer
import com.sevtech.hellographql.repository.DeveloperRepository
import org.springframework.data.mongodb.core.MongoOperations
import org.springframework.data.mongodb.core.query.Criteria
import org.springframework.data.mongodb.core.query.Query
import org.springframework.stereotype.Component

@Component
class DeveloperQueryResolver(val developerRepository: DeveloperRepository,
                             val mongoOperations: MongoOperations) : GraphQLQueryResolver {

    fun developers(): List<Developer> = developerRepository.findAll()

    fun getDevelopersFromProject(projectId: String): List<Developer> {
        val query = Query()
        query.addCriteria(Criteria.where("projectId").`is`(projectId))
        return mongoOperations.find(query, Developer::class.java)
    }

}