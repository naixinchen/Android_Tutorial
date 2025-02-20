# 🚀 Head First Android 实践项目 

<div align="center">
  <img src="https://img.shields.io/badge/Android-3DDC84?style=for-the-badge&logo=android&logoColor=white">
  <img src="https://img.shields.io/badge/Kotlin-0095D5?style=for-the-badge&logo=kotlin&logoColor=white">
  <img src="https://img.shields.io/badge/Android_Studio-3DDC84?style=for-the-badge&logo=android-studio&logoColor=white">
</div>

<p align="center">
  <img src="https://media.giphy.com/media/3o7aCTPPm4OHfRLSH6/giphy.gif" width="200">
</p>

## 📖 项目简介
基于《Head First Android 开发》的学习实践项目，通过20个精心设计的应用模块，带你从零掌握Android开发精髓！

🌟 Android 开发学习轨迹
├── 🎯 阶段 1：基础入门
│   ├── My First App
│   └── Beer Adviser
├── 🎨 阶段 2：布局与 UI 设计
│   ├── Linear Layout Example
│   ├── Frame Layout Example
│   ├── Layout Example
│   ├── Scroll View Example
│   ├── My Constraint Layout
│   ├── My Constraint Layout2
│   └── My Constraint Layout3
├── ⚙️ 阶段 3：功能开发与实战
│   ├── Stopwatch
│   ├── Secret Message
│   ├── Rabbit Chat
│   └── Bits And Pizzas
└── 🚀 阶段 4：现代开发技术
    ├── Stopwatch_view_binding
    ├── Bits And Pizzas_view_binding
    ├── Guessing Game
    ├── Guessing Game_live_data
    ├── Guessing Game_data_binding
    ├── Temperature Converter
    └── Guessing Game Compose

## 🎯 功能亮点

### 📱 应用矩阵
| 应用模块       | 🛠️ 核心技术               | 🎨 特色功能                 |
|----------------|--------------------------|---------------------------|
| **My First App**| `activiity` `layout`    | 构建第一个Android应用，运行并修改应用显示的文字，将“Hello World”的字样修改为“Hello Android”       |
| **Beer Adviser**  | `交互式应用` `spinner组件` `string.xml文件` `OnclickListener`   | 构建一个啤酒推荐师应用，用户可以选择他们喜欢的啤酒的颜色，点击按扭，得到一个包含可以品尝道德啤酒列表       |
| **Linear Layout Example**    | `LinearLayout组件` `EditText组件` `gravity属性` `layout_gravity属性`       | 线性布局的使用，将试图一个接一个地摆在一个垂直列或水平行中           |
| **Frame Layout Example**  | `FrameLayout组件` `ImageView组件` `表达式解析`    | 帧布局的使用，布局可以重叠         |
| **Scroll View Example**  | `ScrollView组件`     | 滚动视图的使用，是一种有垂直或水平滚动条的帧布局         |
| **Layout Example**  | `嵌套布局`     | 通过一个垂直LinearLayout布局嵌套一个水平的LinearLayout布局           |
| **My Constraint Layout**    | `单视图约束`   | 约束布局的使用，更灵活的建立UI，通过Design编译器的蓝图设计一个单视图约束         |
| **My Constraint Layout2**    | `guideline`   | 使用引导线约束视图，当视图大小改变时，屏障会移动        |
| **My Constraint Layout3**    | `chains`   | 使用链（chains）创建一个线性视图，并通过不同的链的样式改变链中视图的摆放方式         |
| **Stopwatch**    | `生命周期`   | 一个记录秒表经过的时间，包括开始、暂停、重置功能的应用，学习活动生命周期         |
| **Secrect Message**    | `Fragment` `Navigation` `Safe Args`  | 通过WelcomeFragment、MessageFragment、EncryptFragment三个片段构建一个多屏幕页面，在第一个屏幕进入欢迎页面，在第二个屏幕输入消息，第三块屏幕对消息加密并显示         |
| **Rabbit Chat**    | `Material库` `应用栏导航` `底部导航栏` `导航抽屉`  | 通过三种导航UI组件构建应用，分别为应用栏导航（App bar）、底部导航栏（bottom navigation bar）、导航抽屉（navigation drawer）         |
| **Bits And Pizzas**    | `Material库` `复合按钮` `FAB`   | 使用Material库构建一个点单的应用，功能包括可折叠的工具栏，复合按钮，FAB按钮         |
| **Stopwatch_view_binding**    | `视图绑定（view binding）`   | 对Stopwatch应用进行修改，在活动代码中使用view binding，不在使用findViewById()         |
| **Bits And Pizzas_view_binding**    | `视图绑定（view binding）`   | 对Bits And Pizzas应用进行修改，在片段代码中使用view binding，不在使用findViewById()         |
| **Guessing Game**    | `视图模型（view model）`   | 一个猜词游戏         |
| **Guessing Game_live_data**    | `live数据（live data）`   | 对Guessing Game应用仅进行修改，使用live数据库进行修改         |
| **Guessing Game_data_binding**    | `数据绑定（data binding）`   | 对Guessing Game应用仅进行修改，使用数据绑定进行修改         |
| **Temperature Converte**    | `compose`   | 使用compose构建一个温度转换器应用         |
| **Guessing Game Compose**    | `compose`   | 对Guessing Game应用仅进行修改，使用compose创建         |



## 🛠️ 项目结构

```bash
📦 HeadFirstAndroid
┣ 📂 app
┃ ┣ 📂 src
┃ ┃ ┣ 📂 main
┃ ┃ ┃ ┣ 📂 java      # 核心逻辑代码 🧠
┃ ┃ ┃ ┣ 📂 res       # 资源宝库 🎨
┃ ┃ ┃ ┃ ┣ 📂 layout  # UI蓝图 🖼️
┃ ┃ ┃ ┃ ┣ 📂 drawable # 图形资源 🖌️
┃ ┃ ┃ ┃ ┗ 📂 values  # 字符串/颜色 🌈
┃ ┃ ┃ ┗ 📜 AndroidManifest.xml # 应用身份证 🆔
┣ 📜 build.gradle    # 构建配置 ⚙️
┗ 📜 README.md       # 项目宝典 📚
```

## 🚀 快速启动

<div align="center">
  <img src="https://img.shields.io/badge/Android_SDK-3DDC84?style=flat&logo=android&logoColor=white">
  <img src="https://img.shields.io/badge/Retrofit-8A4182?style=flat&logo=retrofit&logoColor=white">
  <img src="https://img.shields.io/badge/SQLite-003B57?style=flat&logo=sqlite&logoColor=white">
  <img src="https://img.shields.io/badge/Gradle-02303A?style=flat&logo=gradle&logoColor=white">
</div>

### 准备工作
- Android Studio Flamingo 2022.2.1+
- Android SDK 33+
- Java 17+

### 运行指南
```bash
# 1. 克隆仓库
git clone https://github.com/yourname/HeadFirstAndroid.git

# 2. 导入Android Studio
File → Open → 选择项目目录

#3.修改Gradle的下载地址
选择的项目 → gradle/wrapper → "gradle-wrapper.properties"文件 → 修改"distributionUrl"

# 3. 构建项目
Build → Make Project (Ctrl+F9)

# 4. 运行模拟器
Tools → Device Manager → 创建虚拟设备

# 5. 启动应用
Run → Run 'app' (Shift+F10)
```

## 🌱 学习收获

<div align="center">
  
![技能图谱](https://media.giphy.com/media/3o7btPCcdNniyf0ArS/giphy.gif)

</div>

- 🧬 **Android基本架构**：学会了如何使用`activity`和`layout`创建并修改我的第一个Android应用。
- 🎨 **布局管理技巧**：理解了线性布局(`LinearLayout`)和帧布局(`FrameLayout`)的使用，能够灵活安排视图元素位置。
- 📏 **约束布局进阶**：通过使用`ConstraintLayout`及其特性如`guideline`和`chains`，提升了复杂UI设计能力。
- ⏱️ **活动生命周期掌握**：通过开发秒表应用，深入了解了Android中Activity和Fragment的生命周期管理。
- 🗂️ **导航与片段操作**：学习了如何利用`Fragment`、`Navigation`及`Safe Args`实现多屏幕页面间的流畅切换。
- 🎛️ **Material设计组件**：熟悉了Material库中的应用栏导航、底部导航栏和导航抽屉等UI组件的应用。
- 🔍 **视图绑定技术**：实现了从传统`findViewById()`到现代视图绑定（view binding）的技术升级，简化了视图操作代码。
- 🤖 **ViewModel与LiveData**：通过改造猜词游戏，掌握了利用`ViewModel`和`LiveData`优化数据管理和UI更新的最佳实践。
- 🛠️ **Jetpack Compose探索**：开始使用声明式UI框架Compose重构现有应用，体验了新一代UI构建方式的简洁高效。



## 🤝 参与贡献

欢迎加入我们的开发者社区！🎉

1. **Fork** 本仓库
2. 创建新分支 (`git checkout -b feature/AmazingFeature`)
3. 提交修改 (`git commit -m 'Add some AmazingFeature'`)
4. 推送分支 (`git push origin feature/AmazingFeature`)
5. 发起**Pull Request**

## 📜 开源协议

[![License: MIT](https://img.shields.io/badge/License-MIT-yellow.svg)](https://opensource.org/licenses/MIT)

## 📬 联系作者

<a href="mailto:nancychen666666@gmail.com">
  <img src="https://img.shields.io/badge/Gmail-D14836?style=for-the-badge&logo=gmail&logoColor=white">
</a>
<a href="https://github.com/naixinchen">
  <img src="https://img.shields.io/badge/GitHub-100000?style=for-the-badge&logo=github&logoColor=white">
</a>

---
<!-- 动态分隔线 -->
<p align="center">
  <img src="https://readme-typing-svg.demolab.com?font=Fira+Code&pause=1000&color=58A6FF&width=435&lines=Happy+Coding!+%F0%9F%91%8B%F0%9F%8F%BB" alt="Typing SVG">
</p>

<div align="center">
  Made with ❤️ by [NaixinChen] | 
  Special thanks to《Head First Android》📚
</div>

