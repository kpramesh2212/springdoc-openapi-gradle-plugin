package org.springdoc.openapi.gradle.plugin

import org.gradle.api.Project
import org.gradle.api.file.DirectoryProperty
import org.gradle.api.provider.Property
import javax.inject.Inject

open class OpenApiExtension @Inject constructor(project: Project) {
    val apiDocsUrl: Property<String> = project.objects.property(String::class.java)
    val outputFileName: Property<String> = project.objects.property(String::class.java)
    val outputDir: DirectoryProperty = project.objects.directoryProperty()
}