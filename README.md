
# Clean-MVVM-NewsApp called News9ja

> An Android application built using MVVM architecture.
> 

## Components used in the app.
- [Kotlin](https://kotlinlang.org/) - As a programming language.
- [LiveData](https://developer.android.com/topic/libraries/architecture/livedata) - Lifecycle aware Observable data holder class.
- [ViewModel](https://developer.android.com/topic/libraries/architecture/viewmodel) - To manage the UI-related data in a lifecycle conscious way.
- [Coroutines](https://developer.android.com/kotlin/coroutines) - Used for data manipulations and to switch between main thread and worker thread.
- [Retrofit](https://square.github.io/retrofit/) - For making network calls.
- [Navigation Component](https://developer.android.com/guide/navigation/navigation-getting-started) - Navigation occurs between your app's destinations—that is, anywhere in your app to which users can navigate.
- [Room database](https://developer.android.com/topic/libraries/architecture/room) - To cache the response for offline access.
- [Glide](https://github.com/bumptech/glide) - Glide supports fetching, decoding, and displaying video stills, images, and animated GIFs.

## Description
News9ja is an app which brings the latest news from Google news. Internally app uses [News API](https://newsapi.org/) to fetch the details. This app is built using Clean + MVVM architecture, uses [Retrofit2](http://square.github.io/retrofit/) for making API calls and uses [Room](https://developer.android.com/topic/libraries/architecture/room.html) database to cache the data. It uses Modern Android Development (Architecture Components, MVVM, Kotlin, Coroutines, Retrofit, Room, Glide) and Room DB you can add a news or delete it from locale storage.

## Architecture
![Architecture](https://github.com/Naveentp/Clean-MVVM-NewsApp/blob/master/ART/clean_mvvm.jpeg)

## Screenshots
<img alt="NewsApp" height="450px" src="https://github.com/Naveentp/Clean-MVVM-NewsApp/blob/master/ART/Screenshot-1.png" />

## Steps to build the app
- Create your API key at [News API](https://newsapi.org/)
- Add the generated API key in `app/build.gradle` like below  
`buildConfigField "String", "NEWS_API_KEY", '"YOUR_NEWS_API_KEY"'`
- Build and run the app.

## TODO
- Write test cases for all the modules.  
    - ~~Domain module~~
    - ~~Remote module~~
    - Cache module
    - Data module
    - Presentation Module
    - App module
