plugins {
    java
    application
}

repositories {
    // Use Maven Central for resolving dependencies.
    mavenCentral()
}

dependencies {

    // Use JUnit Jupiter for testing.
    testImplementation("org.junit.jupiter:junit-jupiter:5.9.3")

    testRuntimeOnly("org.junit.platform:junit-platform-launcher")

    // This dependency is used by the application.
    implementation("com.google.guava:guava:32.1.1-jre")

    // ArchUnit
    testImplementation("com.tngtech.archunit:archunit:1.1.0")

	// Vert.x
 	implementation("io.vertx:vertx-core:4.4.5")
 	implementation("io.vertx:vertx-web:4.4.5")
 	
 	// MongoDB
 	implementation("org.mongodb:mongodb-driver-sync:4.11.0")

    // Spring Boot
    implementation("org.springframework.boot:spring-boot:3.1.5")
    implementation("org.springframework.boot:spring-boot-starter-web:3.1.5")
    implementation("org.springframework.data:spring-data-mongodb:4.1.5")
    implementation("org.springframework.boot:spring-boot-starter-thymeleaf:3.1.5")
    implementation("org.springframework.cloud:spring-cloud-starter-gateway:3.1.5")

    // Jakarta Validation APi
    implementation("jakarta.validation:jakarta.validation-api:3.0.2")

}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(20))
    }
}

application {
    mainClass.set("hexagonal_architecture.EScooterManagementSystem")
}

tasks.named<Test>("test") {
    useJUnitPlatform()
}
