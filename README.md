# My Intent Sample

This is a really simple android application written in Kotlin, showing usage of [My Intent](https://github.com/langara/MyIntent) library.
(for older Java version see: [My Blocks Sample](https://github.com/langara/MyBlocksSample))

It shows how using `MyActivity` and `MyFragment` base classes can reduce boilerplate code.

The `MyIntent` library gives you pretty versatile outer layout and material look and behavior ready to use, so you only have to provide the content for your
fragment classes. It supports min sdk: 16

##### It uses two navigation panels:

* Global navigation - usually with global menu and/or header (on the left side)
* Local navigation (separate for every fragment) - usually with local menu and/or local header (on the right side)

Those two navigation panels are implemented as drawers, so it does not take your screen if it is small. But it automatically switches to permanent side panel (or two) if the screen is wide enough.

##### App contains only:
* 3 really short kotlin files
* some simple resource files like two xml layouts for fragments and some images.

##### The whole Kotlin source code is only this:

```kotlin
class MainActivity : MyActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        gnav!!.headerId = R.layout.global_header
        gnav!!.menuId = R.menu.global_menu
        if (savedInstanceState == null) gnav!!.setCheckedItem(R.id.fragment1, true)
    }
}

```

```kotlin
class Fragment1 : MyFragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        manager!!.lnav!!.menuId = R.menu.local_menu1
        manager!!.lnav!!.items { log.w("[SNACK]Item: $it selected.") } // TODO: manage subscription
        return inflater.inflate(R.layout.fragment1, container, false)
    }
}

```

```kotlin
class Fragment2 : MyFragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        manager?.lnav?.menuId = R.menu.local_menu2
        return inflater.inflate(R.layout.fragment2, container, false)
    }
}
```

And the result looks like this:
(TODO: update it all for new Kotlin version)

#### Google Play

* [Old version in Java: My Blocks Sample (on google play)](https://play.google.com/store/apps/details?id=pl.mareklangiewicz.myblockssample)


#### Youtube

* [Old version in Java: My Blocks Sample (on youtube)](https://www.youtube.com/watch?v=R-bpq55UYGI)



#### Screenshots (old version in Java)



###### Nexus 4 portrait

[![device-nexus4-port-2015-11-18-141603.png](screenshots/thumbnails/device-nexus4-port-2015-11-18-141603.png)](https://raw.githubusercontent.com/langara/MyBlocksSample/master/screenshots/device-nexus4-port-2015-11-18-141603.png)
[![device-nexus4-port-2015-11-18-141647.png](screenshots/thumbnails/device-nexus4-port-2015-11-18-141647.png)](https://raw.githubusercontent.com/langara/MyBlocksSample/master/screenshots/device-nexus4-port-2015-11-18-141647.png)
[![device-nexus4-port-2015-11-18-141730.png](screenshots/thumbnails/device-nexus4-port-2015-11-18-141730.png)](https://raw.githubusercontent.com/langara/MyBlocksSample/master/screenshots/device-nexus4-port-2015-11-18-141730.png)
[![device-nexus4-port-2015-11-18-141747.png](screenshots/thumbnails/device-nexus4-port-2015-11-18-141747.png)](https://raw.githubusercontent.com/langara/MyBlocksSample/master/screenshots/device-nexus4-port-2015-11-18-141747.png)
[![device-nexus4-port-2015-11-18-141808.png](screenshots/thumbnails/device-nexus4-port-2015-11-18-141808.png)](https://raw.githubusercontent.com/langara/MyBlocksSample/master/screenshots/device-nexus4-port-2015-11-18-141808.png)
[![device-nexus4-port-2015-11-18-141822.png](screenshots/thumbnails/device-nexus4-port-2015-11-18-141822.png)](https://raw.githubusercontent.com/langara/MyBlocksSample/master/screenshots/device-nexus4-port-2015-11-18-141822.png)



###### Nexus 7 landscape

[![device-nexus7-land-2015-11-18-163417.png](screenshots/thumbnails/device-nexus7-land-2015-11-18-163417.png)](https://raw.githubusercontent.com/langara/MyBlocksSample/master/screenshots/device-nexus7-land-2015-11-18-163417.png)
[![device-nexus7-land-2015-11-18-163502.png](screenshots/thumbnails/device-nexus7-land-2015-11-18-163502.png)](https://raw.githubusercontent.com/langara/MyBlocksSample/master/screenshots/device-nexus7-land-2015-11-18-163502.png)
[![device-nexus7-land-2015-11-18-163529.png](screenshots/thumbnails/device-nexus7-land-2015-11-18-163529.png)](https://raw.githubusercontent.com/langara/MyBlocksSample/master/screenshots/device-nexus7-land-2015-11-18-163529.png)
[![device-nexus7-land-2015-11-18-163629.png](screenshots/thumbnails/device-nexus7-land-2015-11-18-163629.png)](https://raw.githubusercontent.com/langara/MyBlocksSample/master/screenshots/device-nexus7-land-2015-11-18-163629.png)
[![device-nexus7-land-2015-11-18-163820.png](screenshots/thumbnails/device-nexus7-land-2015-11-18-163820.png)](https://raw.githubusercontent.com/langara/MyBlocksSample/master/screenshots/device-nexus7-land-2015-11-18-163820.png)



###### Nexus 7 portrait

[![device-nexus7-port-2015-11-18-163923.png](screenshots/thumbnails/device-nexus7-port-2015-11-18-163923.png)](https://raw.githubusercontent.com/langara/MyBlocksSample/master/screenshots/device-nexus7-port-2015-11-18-163923.png)
[![device-nexus7-port-2015-11-18-163959.png](screenshots/thumbnails/device-nexus7-port-2015-11-18-163959.png)](https://raw.githubusercontent.com/langara/MyBlocksSample/master/screenshots/device-nexus7-port-2015-11-18-163959.png)
[![device-nexus7-port-2015-11-18-164021.png](screenshots/thumbnails/device-nexus7-port-2015-11-18-164021.png)](https://raw.githubusercontent.com/langara/MyBlocksSample/master/screenshots/device-nexus7-port-2015-11-18-164021.png)

