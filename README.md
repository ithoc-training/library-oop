# Bücherei

Eine Bücherei verleiht Bücher und nimmt verliehene Bücher zurück und lagert sie ein. 
Dazu stehen in der Bücherei 200 Regale die jeweils 200 Bücher beinhalten können. 

## Use Cases

### Use Case "LibraryStock"
Als Mitarbeiterin möchte ich mir auflisten lassen, welche Bücher die Bücherei insgesamt zum Verleih anbietet. 
Dabei möchte ich sowohl die verfügbaren als auch die verliehenen Bücher sehen. Dadurch verschaffe ich mir 
einen Überblick über den Umfang der Bücherei. 

### Use Case "LibraryAvailability"
Als Kundin möchte ich sehen, welche Bücher zurzeit zum Verleih zur Verfügung stehen, um mir daraus ein Buch 
auszuleihen. 

### Use Case "BookSearch"
Als Kunden möchte ich ein (oder mehrere) Bücher anhand des Autors oder des Titels suchen, um eine Auswahl 
für die Ausleihe treffen zu können. 

### Use Case "BookLending"
Als Kundin möchte ich ein verfügbares Buch ausleihen, um es lesen zu können. Das Buch wird in der Bücherei als
ausgeliehen markiert, so dass es kein weiteres mal verliehen werden kann. 

### Use Case "BookReturn"
Als Kundin möchte ich ein ausgeliehenes Buch zurückgeben. Dieses Buch wird in der Bibliothek wieder als verfügbar 
markiert. 

## Aufgaben
1. Schreibe für jeden Use Case eine eigene JUnit-Testklasse und jeweils darin für jeden Testfall eine Testmethode.
2. Modelliere die Anforderungen mittels eines objektorientierten Klassendiagramms und zeichne die Abhängigkeiten 
unter den Klassen ein. Notiere auch die Attribute der einzelnen Klassen und ihre Methoden. 
3. Erstelle die Java-Klassen mit ihren Attributen und Methoden anhand des Klassendiagramms. Lege alle Klassen 
in ein Subpackage namens 'model'. 
