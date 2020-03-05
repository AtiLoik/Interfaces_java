1: Créer 2 classes avec des méthodes (A et B)
2: Ajouter une interface et la lier aux deux classes (I)
3: Ajouter une classe parente (P) qui implémente l'interface (I) dont les deux classes (A et B) héritent de la classe parente (P)
	Discussion sur la meilleure solution entre la 2 et la 3
4: Pour A et B, implémenter une autre interface chacune (I1 et I2); Une classe peut implémenter plusieurs interfaces
5: Créer une classe service dont une méthode prend en parametre une interface
6: Méthode par défaut (default) pour mettre en évidence qu'on peut avoir du code dans une interface (depuis java 8)
7: Créer une autre méthode par défaut dans une classe; le compilateur ne bronche pas si on importe pas les méthodes de l'interface
8: Methode static
