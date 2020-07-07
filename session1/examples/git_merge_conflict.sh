#Ishwar.Soni@UE-B-LAP-0121 MINGW64 /d/U-Bank (master)
$ git checkout feature1
#Switched to branch 'feature1'

#Ishwar.Soni@UE-B-LAP-0121 MINGW64 /d/U-Bank (feature1)
$ git log --oneline
#1afa471 (HEAD -> feature1, origin/master) 1002 paid back all the money
#d4c1fc2 added one more transaction between 1001 and 1002
#7775f66 modified Accounts.txt and Transactions.txt files
#79fdf38 added Accounts.txt file and Transactions.txt file

#Ishwar.Soni@UE-B-LAP-0121 MINGW64 /d/U-Bank (feature1)
$ vim Accounts.txt

#Ishwar.Soni@UE-B-LAP-0121 MINGW64 /d/U-Bank (feature1)
$ git commit -a -m 'added one more account with details <1003, akash>'
#[feature1 0de208e] added one more account with details <1003, akash>
# 1 file changed, 1 insertion(+)

#Ishwar.Soni@UE-B-LAP-0121 MINGW64 /d/U-Bank (feature1)
$ git log --oneline
#0de208e (HEAD -> feature1) added one more account with details <1003, akash>
#1afa471 (origin/master) 1002 paid back all the money
#d4c1fc2 added one more transaction between 1001 and 1002
#7775f66 modified Accounts.txt and Transactions.txt files
#79fdf38 added Accounts.txt file and Transactions.txt file

#Ishwar.Soni@UE-B-LAP-0121 MINGW64 /d/U-Bank (feature1)
$ git checkout master
#Switched to branch 'master'
#Your branch is ahead of 'origin/master' by 1 commit.
#  (use "git push" to publish your local commits)

#Ishwar.Soni@UE-B-LAP-0121 MINGW64 /d/U-Bank (master)
$ git merge feature1
#Auto-merging Accounts.txt
#CONFLICT (content): Merge conflict in Accounts.txt
#Automatic merge failed; fix conflicts and then commit the result.

#Ishwar.Soni@UE-B-LAP-0121 MINGW64 /d/U-Bank (master|MERGING)
$ git status
#On branch master
#Your branch is ahead of 'origin/master' by 1 commit.
#  (use "git push" to publish your local commits)

#You have unmerged paths.
#  (fix conflicts and run "git commit")
#  (use "git merge --abort" to abort the merge)

#Unmerged paths:
#  (use "git add <file>..." to mark resolution)
#		both modified:   Accounts.txt

#no changes added to commit (use "git add" and/or "git commit -a")

#Ishwar.Soni@UE-B-LAP-0121 MINGW64 /d/U-Bank (master|MERGING)
$ git status -s
#UU Accounts.txt

#Ishwar.Soni@UE-B-LAP-0121 MINGW64 /d/U-Bank (master|MERGING)
$ vim Accounts.txt

#Ishwar.Soni@UE-B-LAP-0121 MINGW64 /d/U-Bank (master|MERGING)
$ git status -s
#UU Accounts.txt

#Ishwar.Soni@UE-B-LAP-0121 MINGW64 /d/U-Bank (master|MERGING)
$ git add .

#Ishwar.Soni@UE-B-LAP-0121 MINGW64 /d/U-Bank (master|MERGING)
$ git commit -m 'resolved merge conflict in Accounts.txt file'
#[master 596a15e] resolved merge conflict in Accounts.txt file

#Ishwar.Soni@UE-B-LAP-0121 MINGW64 /d/U-Bank (master)
$ git log --oneline
#596a15e (HEAD -> master) resolved merge conflict in Accounts.txt file
#0de208e (feature1) added one more account with details <1003, akash>
#aa30e39 (feature2) added one more account
#1afa471 (origin/master) 1002 paid back all the money
#d4c1fc2 added one more transaction between 1001 and 1002
#7775f66 modified Accounts.txt and Transactions.txt files
#79fdf38 added Accounts.txt file and Transactions.txt file

#Ishwar.Soni@UE-B-LAP-0121 MINGW64 /d/U-Bank (master)
$ git checkout feature1
#Switched to branch 'feature1'

#Ishwar.Soni@UE-B-LAP-0121 MINGW64 /d/U-Bank (feature1)
$ vim Transactions.txt

#Ishwar.Soni@UE-B-LAP-0121 MINGW64 /d/U-Bank (feature1)
$ git commit -a -m '1001 trasnferred 2000rs to 1003'
#[feature1 648d463] 1001 trasnferred 2000rs to 1003
# 1 file changed, 1 insertion(+)

#Ishwar.Soni@UE-B-LAP-0121 MINGW64 /d/U-Bank (feature1)
$ git checkout feature2
#Switched to branch 'feature2'

#Ishwar.Soni@UE-B-LAP-0121 MINGW64 /d/U-Bank (feature2)
$ vim Transactions.txt

#Ishwar.Soni@UE-B-LAP-0121 MINGW64 /d/U-Bank (feature2)
$ git commit -a -m '1001 trasnferred 3000rs to 1003'
#[feature2 837ad33] 1001 trasnferred 3000rs to 1003
# 1 file changed, 1 insertion(+)

#Ishwar.Soni@UE-B-LAP-0121 MINGW64 /d/U-Bank (feature2)
$ git checkout master
#Switched to branch 'master'
#Your branch is ahead of 'origin/master' by 3 commits.
#  (use "git push" to publish your local commits)

#Ishwar.Soni@UE-B-LAP-0121 MINGW64 /d/U-Bank (master)
$ git merge feature1
#Merge made by the 'recursive' strategy.
# Transactions.txt | 1 +
# 1 file changed, 1 insertion(+)

#Ishwar.Soni@UE-B-LAP-0121 MINGW64 /d/U-Bank (master)
$ git log --oneline
#d6f61d5 (HEAD -> master) Merge branch 'feature1'
#648d463 (feature1) 1001 trasnferred 2000rs to 1003
#596a15e resolved merge conflict in Accounts.txt file
#0de208e added one more account with details <1003, akash>
#aa30e39 added one more account
#1afa471 (origin/master) 1002 paid back all the money
#d4c1fc2 added one more transaction between 1001 and 1002
#7775f66 modified Accounts.txt and Transactions.txt files
#79fdf38 added Accounts.txt file and Transactions.txt file

#Ishwar.Soni@UE-B-LAP-0121 MINGW64 /d/U-Bank (master)
$ git merge feature2
#Auto-merging Transactions.txt
#CONFLICT (content): Merge conflict in Transactions.txt
#Automatic merge failed; fix conflicts and then commit the result.

#Ishwar.Soni@UE-B-LAP-0121 MINGW64 /d/U-Bank (master|MERGING)
$ git status
#On branch master
#Your branch is ahead of 'origin/master' by 5 commits.
#  (use "git push" to publish your local commits)

#You have unmerged paths.
#  (fix conflicts and run "git commit")
#  (use "git merge --abort" to abort the merge)

#Unmerged paths:
#  (use "git add <file>..." to mark resolution)
#		both modified:   Transactions.txt

#no changes added to commit (use "git add" and/or "git commit -a")

#Ishwar.Soni@UE-B-LAP-0121 MINGW64 /d/U-Bank (master|MERGING)
$ git log --merge
#commit 837ad332ba76417f7c65f34325d769349a6c4382 (feature2)
#Author: Ishwar Soni <ishwar.soni@upgrad.com>
#Date:   Tue Jul 7 08:12:14 2020 +0530

#	1001 trasnferred 3000rs to 1003

#commit 648d4635c379888945af59ff94e4577cb12c9579 (feature1)
#Author: Ishwar Soni <ishwar.soni@upgrad.com>
#Date:   Tue Jul 7 08:10:55 2020 +0530

#	1001 trasnferred 2000rs to 1003

#Ishwar.Soni@UE-B-LAP-0121 MINGW64 /d/U-Bank (master|MERGING)
$ git diff
#diff --cc Transactions.txt
#index fc400a9,fc28019..0000000
#--- a/Transactions.txt
#+++ b/Transactions.txt
#@@@ -2,4 -2,4 +2,8 @@@ From     To      Amoun
#  1001  1002    500
#  1001  1002    1000
#  1002  1001    1500
#++<<<<<<< HEAD
# +1001  1003    2000
#++=======
#+ 1001  1003    3000
#++>>>>>>> feature2

#Ishwar.Soni@UE-B-LAP-0121 MINGW64 /d/U-Bank (master|MERGING)
$ git diff master feature2
#diff --git a/Accounts.txt b/Accounts.txt
#index c1309ce..7a68169 100644
#--- a/Accounts.txt
#+++ b/Accounts.txt
#@@ -1,4 +1,4 @@
# Account Number         Name
# 1001                   ishwar
# 1002                   srishti
#-1003                   sreejit, akash
#+1003                   sreejit
#diff --git a/Transactions.txt b/Transactions.txt
#index fc400a9..fc28019 100644
#--- a/Transactions.txt
#+++ b/Transactions.txt
#@@ -2,4 +2,4 @@ From    To      Amount
# 1001   1002    500
# 1001   1002    1000
# 1002   1001    1500
#-1001   1003    2000
#+1001   1003    3000

#Ishwar.Soni@UE-B-LAP-0121 MINGW64 /d/U-Bank (master|MERGING)
$ git merge --abort

#Ishwar.Soni@UE-B-LAP-0121 MINGW64 /d/U-Bank (master)
$ git checkout feature2
#Switched to branch 'feature2'

#Ishwar.Soni@UE-B-LAP-0121 MINGW64 /d/U-Bank (feature2)
$ git reset --hard HEAD~1
#HEAD is now at aa30e39 added one more account

#Ishwar.Soni@UE-B-LAP-0121 MINGW64 /d/U-Bank (feature2)
$ git log --oneline
#aa30e39 (HEAD -> feature2) added one more account
#1afa471 (origin/master) 1002 paid back all the money
#d4c1fc2 added one more transaction between 1001 and 1002
#7775f66 modified Accounts.txt and Transactions.txt files
#79fdf38 added Accounts.txt file and Transactions.txt file

#Ishwar.Soni@UE-B-LAP-0121 MINGW64 /d/U-Bank (feature2)
$ git reset --hard HEAD~1
#HEAD is now at 1afa471 1002 paid back all the money

#Ishwar.Soni@UE-B-LAP-0121 MINGW64 /d/U-Bank (feature2)
$ git log --oneline
#1afa471 (HEAD -> feature2, origin/master) 1002 paid back all the money
#d4c1fc2 added one more transaction between 1001 and 1002
#7775f66 modified Accounts.txt and Transactions.txt files
#79fdf38 added Accounts.txt file and Transactions.txt file

#Ishwar.Soni@UE-B-LAP-0121 MINGW64 /d/U-Bank (feature2)
$ git checkout master
#Switched to branch 'master'
#Your branch is ahead of 'origin/master' by 5 commits.
#  (use "git push" to publish your local commits)

#Ishwar.Soni@UE-B-LAP-0121 MINGW64 /d/U-Bank (master)
$ git merge feature2
#Already up to date.

#Ishwar.Soni@UE-B-LAP-0121 MINGW64 /d/U-Bank (master)
$
