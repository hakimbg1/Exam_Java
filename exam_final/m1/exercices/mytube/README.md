# Instructions
## Contexte
Dans VideoProcessor, on fait directement appel aux objects VideoDatabase, VideoEncoder et EmailService.
Ce qui entraine un couplage fort entre la classe VideoProcessor et les 3 autres classes
## Tâche
1. Afin d'éviter le couplage fort, au lieu d'utiliser directement les objets des 3 classe dans VideoProcessor
Il faut utiliser plutôt utiliser des interfaces.
2. Créez donc 3 interfaces correspondant à VideoDatabase, VideoEncoder et EmailService et faites usage de ces interfaces au lieu des objets
