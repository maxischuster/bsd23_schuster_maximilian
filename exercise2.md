Inhalt der zweiten Übung ist das Erstellen eines Git-Repository und ein üben der Grundlagen von Git.


- `git config`: Mit diesem Befehl kannst du Git-Konfigurationen wie deinen Namen und deine E-Mail-Adresse setzen, damit Git weiß, wer Änderungen vornimmt.
- `git init`: Dieser Befehl legt in einem Verzeichnis ein neues Git-Repository an, was bedeutet, dass Git dort die Versionskontrolle über die Dateien in diesem Verzeichnis übernimmt.
- `git commit`: Durch diesen Befehl werden deine Änderungen im Arbeitsverzeichnis als feste Version im Git-Repository gespeichert. Ein Commit ist wie ein Schnappschuss, der den Zustand der Dateien zu einem bestimmten Zeitpunkt festhält.
- `git status`: Hiermit kannst du sehen, welche Dateien verändert wurden und ob sie für den nächsten Commit bereit sind oder nicht. Es zeigt dir den aktuellen Zustand deines Arbeitsverzeichnisses und des Staging-Bereichs an.
- `git add`: Mit diesem Befehl fügst du Dateien, die du verändert hast, dem Staging-Bereich hinzu, was bedeutet, dass sie für den nächsten Commit vorgemerkt sind.
- `git log`: Zeigt eine Liste aller bisherigen Commits an, damit du sehen kannst, was wann geändert wurde. Es zeigt Informationen wie Autor, Datum und Commit-Nachricht jedes Commits an.
- `git diff`: Dieser Befehl zeigt die Unterschiede zwischen verschiedenen Versionen von Dateien an. Du kannst Änderungen zwischen Commits, zwischen dem Arbeitsverzeichnis und dem Staging-Bereich oder zwischen dem Arbeitsverzeichnis und dem letzten Commit sehen.
- `git pull`: Mit diesem Befehl kannst du Änderungen aus einem entfernten Repository herunterladen und in deinen lokalen Branch integrieren, so dass dein lokales Repository auf dem neuesten Stand ist.
- `git push`: Hiermit werden deine lokalen Commits auf ein entferntes Repository hochgeladen, so dass andere Entwickler auf sie zugreifen können. Du teilst deine lokalen Änderungen mit dem Remote-Repository.



| Befehl       | Beschreibung                                                                                                                                              |
|--------------|----------------------------------------------------------------------------------------------------------------------------------------------------------|
| `git config` | Setzt Git-Konfigurationsoptionen wie Name und E-Mail-Adresse, um zu identifizieren, wer Änderungen vornimmt.                                             |
| `git init`   | Initialisiert ein neues Git-Repository in einem Verzeichnis, um die Versionskontrolle über die darin enthaltenen Dateien zu übernehmen.                   |
| `git commit` | Speichert Änderungen im Arbeitsverzeichnis als feste Version im Git-Repository. Ein Commit ist eine Momentaufnahme des Projekts zu einem bestimmten Zeitpunkt. |
| `git status` | Zeigt den aktuellen Status des Arbeitsverzeichnisses und des Staging-Bereichs an, um zu sehen, welche Dateien geändert wurden und bereit sind, committet zu werden. |
| `git add`    | Fügt Dateien, die du verändert hast, dem Staging-Bereich hinzu, um sie für den nächsten Commit vorzubereiten.                                           |
| `git log`    | Zeigt eine Liste aller bisherigen Commits im Repository an, um zu sehen, wer welche Änderungen gemacht hat.                                             |
| `git diff`   | Zeigt die Unterschiede zwischen verschiedenen Versionen von Dateien an, wie z.B. Änderungen zwischen Commits oder zwischen Arbeitsverzeichnis und Staging-Bereich. |
| `git pull`   | Lädt Änderungen aus einem entfernten Repository herunter und führt eine Zusammenführung mit dem lokalen Branch durch, um das lokale Repository auf dem neuesten Stand zu halten. |
| `git push`   | Lädt lokale Commits auf ein entferntes Repository hoch, um die Änderungen für andere Entwickler verfügbar zu machen.                                    |
