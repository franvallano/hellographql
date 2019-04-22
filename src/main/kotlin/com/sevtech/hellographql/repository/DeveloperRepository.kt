package com.sevtech.hellographql.repository

import com.sevtech.hellographql.model.Developer
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.stereotype.Repository

@Repository
interface DeveloperRepository : MongoRepository<Developer, String>