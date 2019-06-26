To use the Easy Toast message display just follow the following steps:

First Step- Implement dependancy in your Build Gradle

	dependencies {
	        implementation 'com.github.9306488494:Toastt:0.1.1'
	}

Second Step :Implement Maven repository

allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}

Third Step : Use the method in your activity to toast the message, just pass Application context and what message you wanna display

MyToast.s(Activity.this,"Message");
