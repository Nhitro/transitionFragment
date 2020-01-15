# Transition entre deux fragments

[MainActivity](https://github.com/Nhitro/transitionFragment/blob/master/app/src/main/java/com/jgarnier/test/MainActivity.java)
[FragmentA](https://github.com/Nhitro/transitionFragment/blob/master/app/src/main/java/com/jgarnier/test/FragmentA.java)
[FragmentB](https://github.com/Nhitro/transitionFragment/blob/master/app/src/main/java/com/jgarnier/test/FragmentB.java)

```java

public void goToFragmentB(@NonNull View view){
    FragmentManager fragmentManager = getSupportFragmentManager();

    fragmentManager.beginTransaction()
           .setCustomAnimations(R.anim.slide_in_right,R.anim.slide_out_left,R.anim.slide_in_left, R.anim.slide_out_right)
           .replace(binding.mainContainer.getId(), new FragmentB())
           .addToBackStack(null)
           .commit();
}

public void goBack(@NonNull View view){
    FragmentManager fragmentManager = getSupportFragmentManager
    fragmentManager.popBackStack();
}

```

# slide_in_right
```xml

<?xml version="1.0" encoding="utf-8"?>
<set xmlns:android="http://schemas.android.com/apk/res/android"
    android:duration="500">

    <translate
        android:fromXDelta="100%"
        android:fromYDelta="0%"
        android:toYDelta="0%"
        android:toXDelta="0%" />

</set>

```
# slide_out_right

```xml

<?xml version="1.0" encoding="utf-8"?>
<set xmlns:android="http://schemas.android.com/apk/res/android"
    android:duration="500">

    <translate
        android:fromXDelta="0%"
        android:fromYDelta="0%"
        android:toYDelta="0%"
        android:toXDelta="100%" />

</set>

```

# slide_in_left
```xml

<?xml version="1.0" encoding="utf-8"?>
<set xmlns:android="http://schemas.android.com/apk/res/android"
    android:duration="500">

    <translate
        android:fromXDelta="-100%"
        android:fromYDelta="0%"
        android:toYDelta="0%"
        android:toXDelta="0%" />

</set>

```

# slide_out_left
```xml

<?xml version="1.0" encoding="utf-8"?>
<set xmlns:android="http://schemas.android.com/apk/res/android"
    android:duration="500">

    <translate
        android:fromXDelta="0%"
        android:fromYDelta="0%"
        android:toYDelta="0%"
        android:toXDelta="-100%" />

</set>

```