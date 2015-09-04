Projet pour tester GitHub et le principe de Liskov

Scénario 1:
Le client demande à avoir des véhicules avec roue et carrosserie de la même couleur.
Le client teste que l'on peut bien créer des véhicules ROUGE ou BLEU.
Puis le client change d'avis: il veut qu'il soit possible d'avoir des véhicules avec roue et carrosserie de couleur différente.

Le principe Substitution de Liskov (Liskov Substitution Principle) est-il rompu ?
Wikipedia: une instance de type T doit pouvoir être remplacée par une instance de type G, tel que G sous-type de T, sans que cela modifie la cohérence du programme.
