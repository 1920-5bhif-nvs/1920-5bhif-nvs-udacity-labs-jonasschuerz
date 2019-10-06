# Entwicklung von Android Apps mit Udacity Kurs :computer:

## :bookmark_tabs: Inhaltsverzeichnis
- [Kurs](https://classroom.udacity.com/courses/ud9012)



## Lesson 1 

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