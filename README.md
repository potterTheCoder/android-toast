# Android-Toast
Android Toast Library.

## Gradle

First, add this in you project level build.gradle file
```
allprojects {
    repositories {
    ...
    maven {
      url 'https://jitpack.io'
    }
  }
}
```

Then, add this in you app level build.gradle file
```
dependencies {
  implementation 'com.github.potterthecoder:android-toast:v0.1'
}
```

## How It Looks:

> Square With Border: 👇

<img src="https://github.com/potterTheCoder/android-toast/blob/master/sample/images/ic_android_toast_s.png" width="250">

> Square With Border Rounded Corner: 👇

<img src="https://github.com/potterTheCoder/android-toast/blob/master/sample/images/ic_android_toast_o.png" width="250">

## How To Use:

Just import **UtilToast** class method ***showToast()*** where ever you want to show a toast.

```
  UtilToast.showToast(getApplicationContext(),  UtilToast.TOAST_SQUARE, "Toast Message Here");
```

Here below *int* to style toast:
| constant     | int value | style                             |
| ------------ | --------- | --------------------------------- |
| TOAST_SQUARE | 0         | Square With Border                | 
| TOAST_OVAL   | 1         | Square With Border Rounded Corner |

## Thanks for your Support.
If you feel that this work really helps you than hit the 🟊 button above.

Appreciate my work here: [Buy Me a ☕ on PayPal](https://www.paypal.me/phjethva)
