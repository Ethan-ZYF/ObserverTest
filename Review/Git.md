1. `git clone <repo>`: Clone repo located at <repo> onto local machine.
2. `git pull <remote>`: Fetch the specified remote's copy of the current branch and immediate merge it into the local copy.
3. `git add <directory>`: Stage all changes in <directory> for the next commit. Replace <directory> with <file> to change a specific file.
4. `git commit -m`: Commit the staged snapshot, but instead of launching a text editor, use <message> as the commit message.
5. `git push`: Push the branch to <remote>, along with necessary commits and objects. Creates named branch in the remote repo if it doesn't exist.
6. `git checkout -b <branch>`: Create and check out a new branch named <branch>, Drop the -b flag to check out an existing branch
7. `git branch`: List all the branches in your repo. Add a <branch> argument to create a new branch with the name <branch>.
8. `git merge`: Merge <branch> in to the current branch