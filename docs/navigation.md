# Navigation

## 导航图（navigation graph）
导航图包含应用需要的所有导航相关的信息，并且描述了在应用中导航相关的信息，导航图是一个XML的文件，用于描述应用中不同目的地（destination）之间的导航关系。

## 导航宿主（navigation host）
导航宿主是一个空容器，用来显示导航图中目的地的容器。

## 导航控制器（navigation controller）
导航控制器是用于执行导航操作的对象，控制用户在应用中导航时要在导航宿主中显示的Fragment

## 创建一个导航的步骤
### 1、使用Gradle为项目增加导航组件
在项目/app/build.gradle.kts文件下，增加以下代码，增加后点击代码编译器上方出现的Sync Now选项
```kotlin
dependencies {
    val nav_version = "2.8.5"
        implementation("androidx.navigation:navigation-fragment-ktx:$nav_version")
    implementation("androidx.navigation:navigation-ui-ktx:$nav_version")
}
```

### 2、创建导航图、增加导航Fragment
<b>（1）创建导航图：</b>在项目/app/src/main/res的文件夹下，然后选择"File"——>"New" ——> "Android Resource FileFile"，在弹出窗口中输入File Name，选择Resources type为"Navigation"

![alt text](/_IMAGE/image_3.png)
![alt text](/_IMAGE/image_4.png)


<b>（2）增加导航Fragment：</b>打开src/naviifation/nav_graph.xml，在设计编译器中，点击上方的的New Destination，选择要添加的Fragment

![alt text](/_IMAGE/image_5.png)


或者在代码编辑器中，添加如下代码
```xml
<?xml version="1.0" encoding="utf-8"?>
<navigation 
    xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/nav_graph"
    app:startDestination="@id/inboxFragment">
    <fragment
        android:id="@+id/BlankFragment"
        android:name="com.example.rabbitchat.InboxFragment"
        android:label="BlankBlank"
        tools:layout="@layout/fragment_inbox" />
</navigation>
```

<b>（3）使用动作连接Fragment：</b>动作（Action）用于连接导航图的目标，在设计编辑器中添加需要连接的Fragment，将一个Fragemnt连接到另一个Fragment，此操作代码如下：
```xml
<fragment
        android:id="@+id/BlankFragment"
        android:name="com.example.secrectmessage.WelcomeFragment"
        android:label="fragment_blank"
        tools:layout="@layout/fragment_blank" >
        <action
            android:id="@+id/action_welcomeFragment_to_messageFragment"
            app:destination="@id/messageFragment" />
    </fragment>
```


### 3、增加导航宿主
导航组件提供内置的导航宿主NavHostFragment，在activity_main.xml文件中的FargementContainerView组件中增加以下代码：
```xml
<androidx.fragment.app.FragmentContainerView
    android:name="androidx.navigation.fragment.NavHostFragment"
    app:navGraph="@navigation/nav_graph"
    app:defaultNavHost="true" />
```


### 4、获得导航控制器
通过View对象的findNavController()方法实现，通过在一个导航按钮写点击事件

```kotlin
view.findNavController().navigate(R.id.action_BlankFragment1_to_action_BlankFragment2)
```

## Fragment之间传递信息
### 1、下载Safe Args插件：

在项目/build.gradle.kts中添加以下代码:

```kts
buildscript {
    repositories {
        google()
    }
    dependencies {
        val nav_version = "2.8.4"
        classpath("androidx.navigation:navigation-safe-args-gradle-plugin:$nav_version")
    }
}
```

在项目/app/build.gradle.kts中添加以下代码:

```kts
plugins {
    id("androidx.navigation.safeargs.kotlin")
}
```


### 2、Fragment接收参数：
<b>设计编译器：</b>点击要接收参数的Fragment

![alt text](/_IMAGE/image_6.png)


<b>代码编译器：</b>在路由导航文件nav_graph.xml中接收参数的Fragment中添加以下代码:

```xml
<argument 
    android:name="message"
    app:argType="string"/>
```

### 3、通过Safe Args生成Directions类为动作添加参数

在发送参数的Fragment的kotlin文件的点击事件中添加以下代码

```kotlin
val action = BlankFragment1Directions.actionBlankFragment1ToBlankFragment2(message)
view.findNavController().navigate(action)
```

在接收参数的Fragment的kotlin文件的点击事件中添加以下代码，方法后的.message为导航图中接收参数的name：

```kotlin
val message = BlanktFragment2Args.fromBundle(requireArguments()).message
```

## 导航图弹出栈Fragment
<b>设计编译器：</b>点击需要弹出的动作 在属性面板中进行的Pop Behavior中的popUpTo属性添加要回退到的Fragment

![alt text](/_IMAGE/image_7.png)

<b>代码编译器：</b>在nav_graph.xml文件在要弹出的Fragment中添加以下代码,BlankFragment要回退到的Frgment

```xml
<action app:popUpTo="@id/BlankFragment"/>
```
