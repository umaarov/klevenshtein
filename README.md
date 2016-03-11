# klevenshtein

Levenshtein algorithm for Kotlin

https://en.wikipedia.org/wiki/Levenshtein_distance

## Use jitpack
Add these lines in your build.gradle:

```
allprojects {
    repositories {
        ...
			  maven { url "https://jitpack.io" }
    }
}

dependencies {
    compile 'com.github.glureau:klevenshtein:-SNAPSHOT'
}
```

## Enjoy

> println("chien".levenshtein("chat"))

`2`

> println("turtle".levenshtein("tortoise"));

`4`

### Source

https://gist.github.com/ademar111190/34d3de41308389a0d0d8

