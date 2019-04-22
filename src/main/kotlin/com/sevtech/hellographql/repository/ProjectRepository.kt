package com.sevtech.hellographql.repository

import com.sevtech.hellographql.model.Project
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface ProjectRepository : MongoRepository<Project, String>