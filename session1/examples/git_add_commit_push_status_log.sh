#Ishwar.Soni@UE-B-LAP-0121 MINGW64 /d/U-Bank (master)
$ git status
#On branch master

#No commits yet

#nothing to commit (create/copy files and use "git add" to track)

#Ishwar.Soni@UE-B-LAP-0121 MINGW64 /d/U-Bank (master)
$ vim Accounts.txt

#Ishwar.Soni@UE-B-LAP-0121 MINGW64 /d/U-Bank (master)
$ vim Transactions.txt

#Ishwar.Soni@UE-B-LAP-0121 MINGW64 /d/U-Bank (master)
$ git status
#On branch master

#No commits yet

#Untracked files:
#  (use "git add <file>..." to include in what will be committed)
#        Accounts.txt
#        Transactions.txt

#nothing added to commit but untracked files present (use "git add" to track)

#Ishwar.Soni@UE-B-LAP-0121 MINGW64 /d/U-Bank (master)
$ git status -s
#?? Accounts.txt
#?? Transactions.txt

#Ishwar.Soni@UE-B-LAP-0121 MINGW64 /d/U-Bank (master)
$ git add Accounts.txt
#warning: LF will be replaced by CRLF in Accounts.txt.
#The file will have its original line endings in your working directory

#Ishwar.Soni@UE-B-LAP-0121 MINGW64 /d/U-Bank (master)
$ git status -s
#A  Accounts.txt
#?? Transactions.txt

#Ishwar.Soni@UE-B-LAP-0121 MINGW64 /d/U-Bank (master)
$ vim Accounts.txt

#Ishwar.Soni@UE-B-LAP-0121 MINGW64 /d/U-Bank (master)
$ git status -s
#AM Accounts.txt
#?? Transactions.txt

#Ishwar.Soni@UE-B-LAP-0121 MINGW64 /d/U-Bank (master)
$ git add .
#warning: LF will be replaced by CRLF in Accounts.txt.
#The file will have its original line endings in your working directory
#warning: LF will be replaced by CRLF in Transactions.txt.
#The file will have its original line endings in your working directory

#Ishwar.Soni@UE-B-LAP-0121 MINGW64 /d/U-Bank (master)
$ git status -s
#A  Accounts.txt
#A  Transactions.txt

#Ishwar.Soni@UE-B-LAP-0121 MINGW64 /d/U-Bank (master)
$ git commit -m 'added Accounts.txt file and Transactions.txt file'
#[master (root-commit) 79fdf38] added Accounts.txt file and Transactions.txt file
# 2 files changed, 3 insertions(+)
# create mode 100644 Accounts.txt
# create mode 100644 Transactions.txt

#Ishwar.Soni@UE-B-LAP-0121 MINGW64 /d/U-Bank (master)
$ git status -s

#Ishwar.Soni@UE-B-LAP-0121 MINGW64 /d/U-Bank (master)
$ vim Accounts.txt

#Ishwar.Soni@UE-B-LAP-0121 MINGW64 /d/U-Bank (master)
$ vim Transactions.txt

#Ishwar.Soni@UE-B-LAP-0121 MINGW64 /d/U-Bank (master)
$ git status -s
# M Accounts.txt
# M Transactions.txt

#Ishwar.Soni@UE-B-LAP-0121 MINGW64 /d/U-Bank (master)
$ git commit -a -m 'modified Accounts.txt and Transactions.txt files'
#warning: LF will be replaced by CRLF in Accounts.txt.
#The file will have its original line endings in your working directory
#warning: LF will be replaced by CRLF in Transactions.txt.
#The file will have its original line endings in your working directory
#[master 7775f66] modified Accounts.txt and Transactions.txt files
# 2 files changed, 2 insertions(+)

#Ishwar.Soni@UE-B-LAP-0121 MINGW64 /d/U-Bank (master)
$ git log
#commit 7775f6601d7b00fb61210ba6d2585374de95e803 (HEAD -> master)
#Author: Ishwar Soni <ishwar.soni@upgrad.com>
#Date:   Mon Jul 6 19:17:36 2020 +0530

#    modified Accounts.txt and Transactions.txt files

#commit 79fdf38d7082742ed327e2084169f8820742e67b
#Author: Ishwar Soni <ishwar.soni@upgrad.com>
#Date:   Mon Jul 6 18:47:52 2020 +0530

#    added Accounts.txt file and Transactions.txt file

#Ishwar.Soni@UE-B-LAP-0121 MINGW64 /d/U-Bank (master)
$ git log -1
#commit 7775f6601d7b00fb61210ba6d2585374de95e803 (HEAD -> master)
#Author: Ishwar Soni <ishwar.soni@upgrad.com>
#Date:   Mon Jul 6 19:17:36 2020 +0530

#    modified Accounts.txt and Transactions.txt files

#Ishwar.Soni@UE-B-LAP-0121 MINGW64 /d/U-Bank (master)
$ git log --committer="Ishwar Soni"
#commit 7775f6601d7b00fb61210ba6d2585374de95e803 (HEAD -> master)
#Author: Ishwar Soni <ishwar.soni@upgrad.com>
#Date:   Mon Jul 6 19:17:36 2020 +0530

#    modified Accounts.txt and Transactions.txt files

#commit 79fdf38d7082742ed327e2084169f8820742e67b
#Author: Ishwar Soni <ishwar.soni@upgrad.com>
#Date:   Mon Jul 6 18:47:52 2020 +0530

#    added Accounts.txt file and Transactions.txt file

#Ishwar.Soni@UE-B-LAP-0121 MINGW64 /d/U-Bank (master)
$ git log --oneline
#7775f66 (HEAD -> master) modified Accounts.txt and Transactions.txt files
#79fdf38 added Accounts.txt file and Transactions.txt file

#Ishwar.Soni@UE-B-LAP-0121 MINGW64 /d/U-Bank (master)
$ git push origin master
#Enumerating objects: 8, done.
#Counting objects: 100% (8/8), done.
#Delta compression using up to 8 threads
#Compressing objects: 100% (5/5), done.
#Writing objects: 100% (8/8), 699 bytes | 87.00 KiB/s, done.
#Total 8 (delta 0), reused 0 (delta 0), pack-reused 0
#To https://github.com/ishwar-soni/U-Bank.git
# * [new branch]      master -> master

#Ishwar.Soni@UE-B-LAP-0121 MINGW64 /d/U-Bank (master)
$ vim Transactions.txt

#Ishwar.Soni@UE-B-LAP-0121 MINGW64 /d/U-Bank (master)
$ git status -s
# M Transactions.txt

#Ishwar.Soni@UE-B-LAP-0121 MINGW64 /d/U-Bank (master)
$ git commit -a -m 'added one more transaction between 1001 and 1002'
#warning: LF will be replaced by CRLF in Transactions.txt.
#The file will have its original line endings in your working directory
#[master d4c1fc2] added one more transaction between 1001 and 1002
# 1 file changed, 1 insertion(+)

#Ishwar.Soni@UE-B-LAP-0121 MINGW64 /d/U-Bank (master)
$ git push -u origin master
#Enumerating objects: 5, done.
#Counting objects: 100% (5/5), done.
#Delta compression using up to 8 threads
#Compressing objects: 100% (2/2), done.
#Writing objects: 100% (3/3), 341 bytes | 341.00 KiB/s, done.
#Total 3 (delta 0), reused 0 (delta 0), pack-reused 0
#To https://github.com/ishwar-soni/U-Bank.git
#   7775f66..d4c1fc2  master -> master
#Branch 'master' set up to track remote branch 'master' from 'origin'.

#Ishwar.Soni@UE-B-LAP-0121 MINGW64 /d/U-Bank (master)
$ vim Transactions.txt

#Ishwar.Soni@UE-B-LAP-0121 MINGW64 /d/U-Bank (master)
$ git status -s
# M Transactions.txt

#Ishwar.Soni@UE-B-LAP-0121 MINGW64 /d/U-Bank (master)
$ git commit -a -m '1002 paid back all the money'
#warning: LF will be replaced by CRLF in Transactions.txt.
#The file will have its original line endings in your working directory
#[master 1afa471] 1002 paid back all the money
# 1 file changed, 1 insertion(+)

#Ishwar.Soni@UE-B-LAP-0121 MINGW64 /d/U-Bank (master)
$ git push
#Enumerating objects: 5, done.
#Counting objects: 100% (5/5), done.
#Delta compression using up to 8 threads
#Compressing objects: 100% (3/3), done.
#Writing objects: 100% (3/3), 336 bytes | 168.00 KiB/s, done.
#Total 3 (delta 0), reused 0 (delta 0), pack-reused 0
#To https://github.com/ishwar-soni/U-Bank.git
#   d4c1fc2..1afa471  master -> master

#Ishwar.Soni@UE-B-LAP-0121 MINGW64 /d/U-Bank (master)
$
