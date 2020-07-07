#Ishwar.Soni@UE-B-LAP-0121 MINGW64 /d/U-Bank (feature1)
$ git checkout master
#Switched to branch 'master'
#Your branch is up to date with 'origin/master'.

#Ishwar.Soni@UE-B-LAP-0121 MINGW64 /d/U-Bank (master)
$ git status
#On branch master
#Your branch is up to date with 'origin/master'.

#nothing to commit, working tree clean

#Ishwar.Soni@UE-B-LAP-0121 MINGW64 /d/U-Bank (master)
$ vim tran_logs.log

#Ishwar.Soni@UE-B-LAP-0121 MINGW64 /d/U-Bank (master)
$ git status
#On branch master
#Your branch is up to date with 'origin/master'.

#Untracked files:
#  (use "git add <file>..." to include in what will be committed)
#        tran_logs.log

#nothing added to commit but untracked files present (use "git add" to track)

#Ishwar.Soni@UE-B-LAP-0121 MINGW64 /d/U-Bank (master)
$ vim .gitignore

#Ishwar.Soni@UE-B-LAP-0121 MINGW64 /d/U-Bank (master)
$ git status
#On branch master
#Your branch is up to date with 'origin/master'.

#Untracked files:
#  (use "git add <file>..." to include in what will be committed)
#        .gitignore

#nothing added to commit but untracked files present (use "git add" to track)

#Ishwar.Soni@UE-B-LAP-0121 MINGW64 /d/U-Bank (master)
$ git add .gitignore
#warning: LF will be replaced by CRLF in .gitignore.
#The file will have its original line endings in your working directory

#Ishwar.Soni@UE-B-LAP-0121 MINGW64 /d/U-Bank (master)
$ git commit -m 'added .gitignore file'
#[master d484499] added .gitignore file
# 1 file changed, 1 insertion(+)
# create mode 100644 .gitignore

#Ishwar.Soni@UE-B-LAP-0121 MINGW64 /d/U-Bank (master)
$ git status
#On branch master
#Your branch is ahead of 'origin/master' by 1 commit.
#  (use "git push" to publish your local commits)

#nothing to commit, working tree clean

#Ishwar.Soni@UE-B-LAP-0121 MINGW64 /d/U-Bank (master)
$ git push
#Enumerating objects: 4, done.
#Counting objects: 100% (4/4), done.
#Delta compression using up to 8 threads
#Compressing objects: 100% (2/2), done.
#Writing objects: 100% (3/3), 330 bytes | 110.00 KiB/s, done.
#Total 3 (delta 0), reused 0 (delta 0), pack-reused 0
#To https://github.com/ishwar-soni/U-Bank.git
#   d6f61d5..d484499  master -> master

#Ishwar.Soni@UE-B-LAP-0121 MINGW64 /d/U-Bank (master)
$ git status
#On branch master
#Your branch is up to date with 'origin/master'.

#nothing to commit, working tree clean

#Ishwar.Soni@UE-B-LAP-0121 MINGW64 /d/U-Bank (master)
$ vim account_logs.log

#Ishwar.Soni@UE-B-LAP-0121 MINGW64 /d/U-Bank (master)
$ git status
#On branch master
#Your branch is up to date with 'origin/master'.

#nothing to commit, working tree clean

#Ishwar.Soni@UE-B-LAP-0121 MINGW64 /d/U-Bank (master)
$
