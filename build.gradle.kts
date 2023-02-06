plugins {
    id("java")
    idea
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("ch.qos.logback:logback-core:1.4.5")
    implementation("org.slf4j:slf4j-api:2.0.5")
    implementation("org.slf4j:jul-to-slf4j:2.0.6")
    testImplementation("org.testng:testng:7.7.0")
    testImplementation("org.seleniumhq.selenium:selenium-java:4.8.0")
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.8.1")
    testRuntimeOnly("ch.qos.logback:logback-classic:1.4.5")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.8.1")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}