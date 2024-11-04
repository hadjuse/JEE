# TP02 - Servlets J2EE

TP réalisé pour le TP02 du cours de J2EE (ING2, GSI) 2024-2025. Ce TP consiste en la création de plusieurs servlets pour afficher des messages, effectuer des redirections, et gérer un système de login simple sans utiliser de JSP.
Les noms: Hadj Rabearimanana, Sekou Bah et Clément Praud
## Structure du Projet

Ce projet contient trois exercices, chacun sous la forme de servlets distinctes.

## Exigences Techniques
- Environnement J2EE (Java Servlet API)
- Serveur d'application compatible (ex : Apache Tomcat)
- Aucune utilisation de JSP (JavaServer Pages) conformément aux consignes

## Contenu du Projet

### Exercice 1 : Première Servlet - `HelloWorld`

La servlet `HelloServlet` affiche un message de bienvenue et l'heure système actuelle.

- **Accès** : `/hello`
- **Fonctionnalité** : Affiche le message `"Hello world, this is my first servlet"` ainsi que l'heure courante.
- **HTML associé** : `index.html` permet de créer un lien pour accéder à cette servlet.

### Exercice 2 : Servlet de Redirection - `RedirectServlet`

La servlet `RedirectServlet` redirige l'utilisateur vers une URL spécifiée dans les paramètres d'URL.

- **Accès** : `/RedirectServlet`
- **Paramètres** :
  - `action=PageRedirect` - spécifie l'action de redirection.
  - `page` - l'URL vers laquelle l'utilisateur sera redirigé.
- **Exemple** : `/RedirectServlet?action=PageRedirect&page=http://google.fr` redirige vers Google France.

### Exercice 3 : Servlet de Login - `LoginServlet`

La servlet `LoginServlet` vérifie les identifiants d'un utilisateur via un formulaire de login.

- **Accès** : `/LoginServlet`
- **Fonctionnalités** :
  - Affiche un formulaire de connexion avec nom d'utilisateur et mot de passe.
  - Authentifie l'utilisateur avec les identifiants suivants : `J2EE` / `J2EE`.
  - En cas de succès, affiche un formulaire de redirection qui utilise `RedirectServlet`.
  - En cas d'échec, affiche un message d'erreur.
- **Formulaire HTML associé** : `login.html` pour le formulaire de connexion.

## Installation et Déploiement

1. **Clonez le projet** ou ajoutez les fichiers de code Java dans votre environnement de développement compatible avec J2EE.
2. **Compilez et déployez** le projet sur un serveur d'application compatible (ex : Tomcat).
3. **Accédez aux servlets** en suivant les chemins définis ci-dessus (par exemple, `/hello`, `/RedirectServlet`, et `/LoginServlet`).

## Usage

1. **HelloServlet** : Accédez à `/hello` pour voir un message de bienvenue et l'heure système.
2. **RedirectServlet** : Utilisez les paramètres `action=PageRedirect` et `page` pour rediriger vers l'URL souhaitée.
3. **LoginServlet** :
   - Accédez à `login.html` pour ouvrir le formulaire de login.
   - Entrez les identifiants `J2EE` / `J2EE` pour accéder au formulaire de redirection.
   - Si les identifiants sont incorrects, un message d'erreur s'affiche.

## Notes

- **Aucune JSP n'est utilisée** dans ce projet, conformément aux exigences du TP.
- Le code HTML des formulaires et messages est généré directement dans les servlets.

## Auteurs

Ce projet a été réalisé dans le cadre du TP J2EE (ING2, GSI) 2024-2025.