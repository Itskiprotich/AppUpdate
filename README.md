# AppUpdate

Android Library for an app update.
 
### Installing

Basic Usage:

Step 1. **Add the JitPack repository to your build file**

```
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```

Step 2. ** Add the dependency **

```
dependencies {
	    implementation 'com.github.Keeprawteach:AppUpdate:1.1.2'
	}
```

Step 3. ** Add the following in your manifest file **
 
```
    <activity 
    android:name="com.kiprotich.japheth.update.CheckUpdate">
    </activity>
```

Step 4. Start the activity `CheckUpdate.class` in your specified update method

```
    Intent intent = new Intent(Dashboard.this, CheckUpdate.class);
    intent.putExtra(Config.BUILD_URL, BuildConfig.APPLICATION_ID);
    startActivity(intent);
    Dashboard.this.finish();
```
 
 

## Authors

* **Kiprotich Japheth**
 

