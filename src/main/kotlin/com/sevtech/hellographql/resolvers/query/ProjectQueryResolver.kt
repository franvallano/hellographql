package com.sevtech.hellographql.resolvers.query

import com.coxautodev.graphql.tools.GraphQLQueryResolver
import com.sevtech.hellographql.model.Developer
import com.sevtech.hellographql.model.Project
import com.sevtech.hellographql.repository.ProjectRepository
import org.springframework.data.mongodb.core.MongoOperations
import org.springframework.data.mongodb.core.query.Criteria
import org.springframework.data.mongodb.core.query.Query
import org.springframework.stereotype.Component

@Component
class ProjectQueryResolver(val projectRepository: ProjectRepository,
                           val mongoOperations: MongoOperations) : GraphQLQueryResolver {

    fun projects(): List<Project> {
        val projects = projectRepository.findAll()
        projects.forEach { it.developers = getDevelopers(projectId = it.id!!) }
        return projects
    }

    private fun getDevelopers(projectId: String): List<Developer> {
        val query = Query()
        query.addCriteria(Criteria.where("projectId").`is`(projectId))
        return mongoOperations.find(query, Developer::class.java)
    }
}