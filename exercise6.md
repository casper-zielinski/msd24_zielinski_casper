# Exercise 6

- Was ist notwendig um Maven Site Dokumentation zu generieren?

> *A: Als erstest ist natürlich Maven notwendig und die richtige Konfiguration in der pom.xml. Als nächstes eine site.xml in einem site ordner mit einer richitgen Ordnerstruktur (in unseren Fall nur die site.xml und der Markdown unterodner). In der site.xml die Dokumentation der Maven Site konfigurieren. Als nächstes kommt der mvn site Befehl bzw der mvn test Befehl bevor damit man die Testergebnisse in die Dokumentation integriert. Nun ist man fertig, nur den mvn site kommand ausführen und schon hat man eine Maven Site Dokumentation*

- Welche unterschiedlichen Aspekte, Konfigurationen, Informationen, usw. werden in site.xml bzw. pom.xml konfiguriert?

> *A: In der ``pom.xml`` wird ein Developers Block Konfiguriert der dann in der Maven Site Dokumention angezeigt wird. Da kann man verschiedene Informationen reingeben wie Name, Alter, Organisation für die man arbeitet, Links zu Organisationen, Bilder usw. Dann verschiedene plugins für generieren von test abdeckungen, maven site für dokumentation, JavaDoc in maven site dokumentationen, Abschaffung von Javadoc Fehlermeldungen und Test Abdeckung von JaCoCo Plugin integration in maven site Dokumentation*  
> *In der site.xml wird die Struktur der Maven Site Documentation konfiguriert sowie andere Sachen, z.B. welche Seiten noch in der Dokumentation inkludiert werden sollen usw.*

## Verlinkungen

<h3> 

[Readme](README.md)
</h3>