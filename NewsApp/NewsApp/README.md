# NewsApp

#### Setup API Key
1. Visit [NewsAPI.org](https://newsapi.org/register) to get your API Key
2. Copy your API Key from accounts section
3. Open `gradle.properties` *(Create the file if not exists)*
   - For Linux/Mac: `/home/.gradle/gradle.properties`
   - For Windows: `C:\Users\<UserName>\.gradle\gradle.properties`
   - Add the following line:
    ```
    NewsApi_ApiKey="YOUR_API_KEY"
    ``` 


#### Demo
- ##### Home
<img src="app.gif" width="40%">

- ##### Widget
<img src="widget.gif" width="40%">

#### Libraries
- [Google gson](https://github.com/google/gson) For parsing JSON data
- [Retrofit](http://square.github.io/retrofit/) For sending network requests
- [Glide](https://github.com/bumptech/glide) Loading and caching images
- [Room, LiveData and ViewModel](https://developer.android.com/topic/libraries/architecture/) Latest Android Architecture components
- [Databinding](https://developer.android.com/topic/libraries/data-binding/) Binding data and reducing 100s of Lines of Code

#### Credits
- [Udacity](https://udacity.com/) For teaching me Android


