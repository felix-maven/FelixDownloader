# FelixDownloader

# Installation

FelixDownloader is installed by adding the following dependency to your build.gradle file:

```
dependencies {
    implementation "com.felix.downloader:felix-downloader:1.0.0"
}
```
Also you should add the component base by adding the following dependency to your build.gradle file:

```
dependencies {
    implementation "com.felix.combase:felix-combase:1.0.0"
}
```

Snapshots of the development version are available in Sonatype's snapshots repository, you can include on your gradle project through:

```
repositories {
    maven { url 'https://dl.bintray.com/felix-maven/maven' }
}
```
