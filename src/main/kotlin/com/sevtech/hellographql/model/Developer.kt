package com.sevtech.hellographql.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document("developer")
data class Developer(@Id var id: String?,
                     var projectId: String?,
                     var name: String,
                     var surname: String,
                     var email: String)