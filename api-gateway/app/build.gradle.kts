plugins {
	java
	application
}

java {
	toolchain {
		languageVersion.set(JavaLanguageVersion.of(17))
	}
}

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.cloud:spring-cloud-starter-gateway:3.1.5")
	testImplementation("org.springframework.boot:spring-boot-starter-test:3.1.5")
	implementation("org.springframework.cloud:spring-cloud-dependencies:2022.0.4")
}

application {
	mainClass.set("gateway.ApiGatewayApplication")
}

tasks.named<Test>("test") {
	useJUnitPlatform()
}
