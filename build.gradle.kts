plugins {
    id("java")
}

group = "org.somethings"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation("io.rest-assured:rest-assured:5.3.1") //для get-запросов

}

tasks.test {
    useJUnitPlatform()
}