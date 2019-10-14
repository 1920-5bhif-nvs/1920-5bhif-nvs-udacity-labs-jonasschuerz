# Entwicklung von Android Apps mit Udacity Kurs :computer:

## :bookmark_tabs: Inhaltsverzeichnis
- [Kurs](https://classroom.udacity.com/courses/ud9012)
- [Lesson 1](#scroll-Lesson-1)
- [Lesson 2](#scroll-Lesson-2)


## :scroll: Lesson 1 

### 1.1 Welcome to Developing Android Apps
In dieser Lektion werden die Vorraussetzungen beschrieben: Einen starken Rechner sodass Android Studio problemfrei laufen kann und Kotlin Kenntnisse

### 1.2 Dice Roller
In dieser Lektion soll man das Android Studio installieren und es wird erklärt welche App wir als erstes erstellen. Es wird erklärt wie man die App von Grund auf erstellt und weiter wie man images und interactive Buttons erstellt.

### 1.3 Installing Android Studio
In dieser Lektion wird erklät wie man das Android Studio installiert.

### 1.4 Creating the Dice Roller Project: Written Instructions
In dieser Lektion wird beschrieben wie man das Projekt anlegt:

- Start a new Android Studio Project
- Choose your project: Empty Activity
- Configure your Project: Name: Dice Roler, Package Name: com.example.android.diceroller, Language: Kotlin, Minimum API Level: API 19
- Fertig

### 1.5 Running your First App
Hier wird erklärt das man die App auf einem virtuellen Handy(Emulator) laufen lassen kann oder auf einem echten Gerät(Handy, Tablet).

### 1.6 Running your First App on an Emulator
In dieser Lektion lernt man wie man einen Emulator konfiguriert und startet:
- Öffne AVD Manager
- Create new Virtual Device
- Hardware auswählen(Handy, TV, Wear OS, Tablet)
- API Level auswählen und downloaden
- Danach startet die App mit dem ausgewählten Emulator

### 1.7 Running your first App on a Device
In dieser Lektion wird gezeigt wie man Android Apps auf ein echtes Gerät deployed:
- Einstellungen -> Geräteinformationen -> auf Bildnummer drücken bis der Entwicklermodus aktiviert ist
- Einstellungen -> Entwickleroptionen -> USB-Debugging zulassen

### 1.8 Student Interview: Part 1 
In dieser Lektion sprechen verschiedene Personen von der ganzen Welt über diesen Android Kurs und die meisten sind sehr begeistert.

### 1.9 Main App Anatomy
In dieser Lektion wird die Struktur(Ordner/Files die erstellt werden) einer Android App erklärt:
- AndroidManifest.xml -> Hier steht alles drinnen was das OS System wissen muss um die App zu starten
- Gradle scripts builden  die App
- Kotlin files für die Kernlogic der App
- res Ordner(für static Content: layout, Strings, Icons, Images)

### 1.10 Quiz App Anatomy
![](Pictures/Lesson_1_1.10.png)

### 1.11 Activity and Layout
Zu einer Activity Klasse gehört immer ein XML File.
In der Activity Klasse(Kotlin Code) ist drinnen was die App machen soll(die Logik).
Im XML-File ist das Layout, sprich wie die App ausschaun soll. Gemeinsam verbunden sind die beiden Files mit Layout Inflation.
![](Pictures/Lesson_1_1.11.png)
![](Pictures/Lesson_1_1.11_2.png)

### 1.12 Exercise: Hello Android
In dieser Lektion wird der Text im Xml File von "Hello World" auf "Hello Android" geändert.

### 1.13 Adding the Button
In dieser Lektion wird erklärt wie man einen Button zur App hinzufügt.

### 1.14 Exercise: Adding the Button    
In dieser Lektion muss man die Übung von Lektion 1.13 auf das Project DiceRoller übertragen

### 1.15 Connecting the Button
Man lernt wie man einen Button mit der Activity Klasse verbindet. 
- Man gibt den Button eine Id, diese Id wird in der R Classe gespeichert.
- Von der MainActivity.kt kann der button mittels: 
``` findByViewId(R.id.roll_button) ```

### 1.16 Exercise: findByViewId
In dieser Übung wird der Text vom Button in der Kotlin Klasse geändert

### 1.17 Exercise: OnClickListener
Bei dieser Übung wird darauf reagiert wenn man auf den Button klickt. Es wird eine Toast benachrichtigung verschickt.
```
 rollButton.setOnClickListener {
    Toast.makeText(this, "button clicked", Toast.LENGTH_SHORT).show()
} 
```

### 1.18 Exercise: Change the Text 
In dieser Übung wird wenn man auf den Button klickt verschiedene Zahlen ausgegeben mittels der Random Klasse 
```
private fun rollDice() {
        val resultText: TextView = findViewById(R.id.result_text)
        val randomInt = Random().nextInt(6) + 1
        resultText.text = randomInt.toString()
    }
```

### 1.19 Dice Images
Dies ist ein Einführungsvideo zu der nächsten Übung, in welcher wir die erzeugten Zahlen in Images umwandeln

### 1.20 Adding the Image Resource
Images werden in den Folder drawable gegeben

### 1.21 Exercise the ImageView
In dieser Übung werden die Zahlen mit Images getauscht.
Mit der when Expression
```
val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
```
### 1.22 Student Interview: Part 2
In dieser Lektion wurden wieder Studenten interviewt wie es ihnen ging damit Android zu lernen.

### 1.23 Exercise: Finding Views Efficiently
findViewById ist sehr performancelastig. Mit lateinit wird der Variable ein Wert zugewiesen beim ersten Aufruf, somit kann es nicht null sein. Dies wird gemacht für eine bessere Performance

### 1.24 Namespaces
Im XML gibt es verschiedene Namespaces. Wenn man zb. ein Image in der Preview sehen möchte aber nicht beim start so kann man bei Tools das Image eingeben was man in der Preview sehen möchte.
```
    android:src="@drawable/empty_dice"
    tools:src="@drawable/dice_1"/>
```
### 1.25 Introduction to Gradle
Gradle ist das Build Tool für Android. Es steuert verschiedene Dinge wie: kompilieren, dependency management, führt automatische Tests aus,... 
<p>Aus diesen Ressourcen wird ein APK File erstellt. Diese File wird dann auf dem Device installiert.

### 1.26 Build.gradle
Gradle Files beinhalten dependencies, plugins, die sdk Version, eine ApplicationId(darf nur einmal auf dem Device vorhanden sein)

### 1.27 Android Compatibility
Android läuft auf verschiedene Geräte(Tv, Tablet, Handy,...). Darum sind API Levels wichtig. Je niedriger das API-Level desto mehr Geräte können die App starten. 
Im Gradle sieht man die mindest SdkVersion die dein Device zum starten braucht.

```
android {
    compileSdkVersion 28
    defaultConfig {
        applicationId "at.htl.diceroller"
        minSdkVersion 19
        targetSdkVersion 28
        versionCode 1
        versionName "1.0"
        testInstrumentationRunner "androidx.test.runner.AndroidJUnitRunner"
    }
```

### 1.28 Exercise: Vector Drawables
Siehe im Projekt

### 1.29 Recap
In dieser Lektion wird die Lesson noch einmal zusammengefasst was man lernte:
- Setup Android Studio
- Setup device or emulator
- Basic App Structure
- Layouts, Activities and Inflation
- Interaction via Button

## :scroll: Lesson 2

### 2.1 Art with Alexs
In dieser Einführungslektion erfahren wir das es in dieser Lesson über Layouts(Constraint Layout) gehen wird.

### 2.2 Introduktion
Hier wird erklärt das wir in dieser Lektion auch über verschiedene Arten von views und resources. Weiters lernen wir wie man den Android Studios Layout Editor verwendet. 

### 2.3 View Groups & View Hierarchy
In dieser Lektio lernt man über die View Hierarchy und View Groups.
![](Pictures/Lesson_2_2.3.png)
![](Pictures/Lesson_2_2.3_2.png)

### 2.4 Create the AboutMe Project
In dieser Lektion wird das Projekt AboutMe erstellt.

### 2.5 Exercise: Create the Layout File
In diser Übung wird das activity_main.xml File erstellt falls es noch nicht vorhanden ist.

### 2.6 Layout Editor Basics
In dieser Lektion werden alle Teile vom Layout Editor erklärt.
Anschließend gab es wieder ein Quiz darüber. 

### 2.7 Adding a TextView
In dieser Lektion habe ich eine TextView hinzugefügt. Weiters habe ich den Text unter Attribute und die Schriftgröße bei textSize geändert.
Unter Attribute -> neben den Text kann man den Ressourcen Editor öffnen. Im Ressourcen Manager rechts oben kann man eine neue String Value Resource anlegen 
![](Pictures/Lesson_2_2.7.png)

### 2.8 Styling a TextView
In dieser Lektion wird der Text durch Margin und Padding ausgerichtet. Weiters wurde eine andere Font eingestellt(Roboto).

### 2.9 Exercise: Add a Textview, Imageview, and Styling
Unter common habe ich in dieser Lektion eine neuen Image hinzugefügt(btn_star_big_on). Weiters habe ich die Id des Images geändert. Weiters habe ich noch eine neue String resource angelegt(Diese resource wird von Screen Readers benutzt um ein Image zu beschreiben) und margin hinzugefügt.

### 2.10 Exercise: Add a Scrollview
In dieser Lektion gab ich der App eine ScrollView. Der ScrollView habe ich eine ID gegeben, sodass die scroll position erhalten bleibt wenn ich das Handy drehe.
In der ScrollView habe ich einen Text hinzugefügt. 
Somit kann ich beim Text nach unten und oben scrollen.
![](Pictures/Lesson_2_2.10.png)

### 2.11 Adding an EditText for Text Input
In dieser Lektion habe ich eine EditBox hinzugefügt(Text -> Plain Text).

### 2.12 Adding a Done Button to Accept Text Input
In dieser Lektion wir ein neuer Button und eine TextView hinzugefügt.

### 2.13 Exercise: Add EditText, Done Button, ClickHandler
In dieser Lektion gab ich dem Button eine Logik.
```
 findViewById<Button>(R.id.done_button).setOnClickListener {
            addNickname(it)
        }
 ```
 Wenn der Button gedrückt wird, wird die Methode addNickname ausgeführt.

 ### 2.14 Data Binding
 In dieser Lektion lernt man darüber wie Data Binding funktioniert.
 ![](Pictures/Lesson_2_2.14.png)

### 2.15 Data Binding: Views
Um Data Binding nutzen können muss man DataBinding im build.gradle(Module:app) aktivieren.

```
 dataBinding {
        enabled = true
    }
````
Als nächstes müssen wir unser xml layout mit einen Layout tag einwickeln.
Danach kann man ein Binding Object im Main Activity Kotlin file erstellen: 
```
private lateinit var binding: ActivityMainBinding
``` 
### 2.16 Data Binding: Data
In dieser Lektion wird erklärt wie man eine neue Kotlin Klasse erstellt. Statt einer String ressource verwenden wir jetzt eine Klasse.

### 2.17 Exercise: Implement Data Binding
In dieser Lektion wird das gelernte aus der Lektion davor auf unser Projekt übertragen.