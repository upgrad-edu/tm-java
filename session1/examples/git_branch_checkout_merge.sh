#Ishwar.Soni@UE-B-LAP-0121 MINGW64 /d/U-Bank (master)
$ git branch
#* master

#Ishwar.Soni@UE-B-LAP-0121 MINGW64 /d/U-Bank (master)
$ git branch dev

#Ishwar.Soni@UE-B-LAP-0121 MINGW64 /d/U-Bank (master)
$ git branch
#  dev
#* master

#Ishwar.Soni@UE-B-LAP-0121 MINGW64 /d/U-Bank (master)
$ git branch -d dev
#Deleted branch dev (was 1afa471).

#Ishwar.Soni@UE-B-LAP-0121 MINGW64 /d/U-Bank (master)
$ git branch
#* master

#Ishwar.Soni@UE-B-LAP-0121 MINGW64 /d/U-Bank (master)
$ git branch feature1

#Ishwar.Soni@UE-B-LAP-0121 MINGW64 /d/U-Bank (master)
$ git checkout feature1
#Switched to branch 'feature1'

#Ishwar.Soni@UE-B-LAP-0121 MINGW64 /d/U-Bank (feature1)
$ git branch
#* feature1
#  master

#Ishwar.Soni@UE-B-LAP-0121 MINGW64 /d/U-Bank (feature1)
$ git checkout -b feature2
#Switched to a new branch 'feature2'

#Ishwar.Soni@UE-B-LAP-0121 MINGW64 /d/U-Bank (feature2)
$ git branch
#  feature1
#* feature2
#  master

#Ishwar.Soni@UE-B-LAP-0121 MINGW64 /d/U-Bank (feature2)
$ git log --oneline
#1afa471 (HEAD -> feature2, origin/master, master, feature1) 1002 paid back all the money
#d4c1fc2 added one more transaction between 1001 and 1002
#7775f66 modified Accounts.txt and Transactions.txt files
#79fdf38 added Accounts.txt file and Transactions.txt file

#Ishwar.Soni@UE-B-LAP-0121 MINGW64 /d/U-Bank (feature2)
$ git checkout d4c1fc2
#Note: switching to 'd4c1fc2'.

#You are in 'detached HEAD' state. You can look around, make experimental
#changes and commit them, and you can discard any commits you make in this
#state without impacting any branches by switching back to a branch.

#If you want to create a new branch to retain commits you create, you may
#do so (now or later) by using -c with the switch command. Example:

#  git switch -c <new-branch-name>

#Or undo this operation with:

#  git switch -

#Turn off this advice by setting config variable advice.detachedHead to false

#HEAD is now at d4c1fc2 added one more transaction between 1001 and 1002

#Ishwar.Soni@UE-B-LAP-0121 MINGW64 /d/U-Bank ((d4c1fc2...))
$ git checkout feature2
#Previous HEAD position was d4c1fc2 added one more transaction between 1001 and 1002
#Switched to branch 'feature2'

#Ishwar.Soni@UE-B-LAP-0121 MINGW64 /d/U-Bank (feature2)
$ git log --oneline
#1afa471 (HEAD -> feature2, origin/master, master, feature1) 1002 paid back all the money
#d4c1fc2 added one more transaction between 1001 and 1002
#7775f66 modified Accounts.txt and Transactions.txt files
#79fdf38 added Accounts.txt file and Transactions.txt file

#Ishwar.Soni@UE-B-LAP-0121 MINGW64 /d/U-Bank (feature2)
$ vim Accounts.txt

#Ishwar.Soni@UE-B-LAP-0121 MINGW64 /d/U-Bank (feature2)
$ git status -s
# M Accounts.txt

#Ishwar.Soni@UE-B-LAP-0121 MINGW64 /d/U-Bank (feature2)
$ git commit -a -m 'added one more account'
#warning: LF will be replaced by CRLF in Accounts.txt.
#The file will have its original line endings in your working directory
#[feature2 aa30e39] added one more account
# 1 file changed, 1 insertion(+)

#Ishwar.Soni@UE-B-LAP-0121 MINGW64 /d/U-Bank (feature2)
$ git log --oneline
#aa30e39 (HEAD -> feature2) added one more account
#1afa471 (origin/master, master, feature1) 1002 paid back all the money
#d4c1fc2 added one more transaction between 1001 and 1002
#7775f66 modified Accounts.txt and Transactions.txt files
#79fdf38 added Accounts.txt file and Transactions.txt file

#Ishwar.Soni@UE-B-LAP-0121 MINGW64 /d/U-Bank (feature2)
$ git checkout master
#Switched to branch 'master'
#Your branch is up to date with 'origin/master'.

#Ishwar.Soni@UE-B-LAP-0121 MINGW64 /d/U-Bank (master)
$ git log --oneline
#1afa471 (HEAD -> master, origin/master, feature1) 1002 paid back all the money
#d4c1fc2 added one more transaction between 1001 and 1002
#7775f66 modified Accounts.txt and Transactions.txt files
#79fdf38 added Accounts.txt file and Transactions.txt file

#Ishwar.Soni@UE-B-LAP-0121 MINGW64 /d/U-Bank (master)
$ git merge feature2
#Updating 1afa471..aa30e39
#Fast-forward
# Accounts.txt | 1 +
# 1 file changed, 1 insertion(+)

#Ishwar.Soni@UE-B-LAP-0121 MINGW64 /d/U-Bank (master)
$ git log --oneline
#aa30e39 (HEAD -> master, feature2) added one more account
#1afa471 (origin/master, feature1) 1002 paid back all the money
#d4c1fc2 added one more transaction between 1001 and 1002
#7775f66 modified Accounts.txt and Transactions.txt files
#79fdf38 added Accounts.txt file and Transactions.txt file