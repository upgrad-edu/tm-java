#Ishwar.Soni@UE-B-LAP-0121 MINGW64 /d/U-Bank (master)
$ git push
#Enumerating objects: 17, done.
#Counting objects: 100% (17/17), done.
#Delta compression using up to 8 threads
#Compressing objects: 100% (14/14), done.
#Writing objects: 100% (14/14), 1.46 KiB | 498.00 KiB/s, done.
#Total 14 (delta 3), reused 0 (delta 0), pack-reused 0
#remote: Resolving deltas: 100% (3/3), done.
#To https://github.com/ishwar-soni/U-Bank.git
#   1afa471..d6f61d5  master -> master

#Ishwar.Soni@UE-B-LAP-0121 MINGW64 /d/U-Bank (master)
$ git checkout feature1
#Switched to branch 'feature1'

#Ishwar.Soni@UE-B-LAP-0121 MINGW64 /d/U-Bank (feature1)
$ git push -u origin feature1
#Total 0 (delta 0), reused 0 (delta 0), pack-reused 0
#remote:
#remote: Create a pull request for 'feature1' on GitHub by visiting:
#remote:      https://github.com/ishwar-soni/U-Bank/pull/new/feature1
#remote:
#To https://github.com/ishwar-soni/U-Bank.git
# * [new branch]      feature1 -> feature1
#Branch 'feature1' set up to track remote branch 'feature1' from 'origin'.

#Ishwar.Soni@UE-B-LAP-0121 MINGW64 /d/U-Bank (feature1)
$ git checkout feature2
#Switched to branch 'feature2'

#Ishwar.Soni@UE-B-LAP-0121 MINGW64 /d/U-Bank (feature2)
$ git push -u origin feature2
#Total 0 (delta 0), reused 0 (delta 0), pack-reused 0
#remote:
#remote: Create a pull request for 'feature2' on GitHub by visiting:
#remote:      https://github.com/ishwar-soni/U-Bank/pull/new/feature2
#remote:
#To https://github.com/ishwar-soni/U-Bank.git
# * [new branch]      feature2 -> feature2
#Branch 'feature2' set up to track remote branch 'feature2' from 'origin'.

#Ishwar.Soni@UE-B-LAP-0121 MINGW64 /d/U-Bank (feature2)
$ git pull origin feature1
#From https://github.com/ishwar-soni/U-Bank
# * branch            feature1   -> FETCH_HEAD
#Updating 1afa471..648d463
#Fast-forward
# Accounts.txt     | 1 +
# Transactions.txt | 1 +
# 2 files changed, 2 insertions(+)

#Ishwar.Soni@UE-B-LAP-0121 MINGW64 /d/U-Bank (feature2)
$ git pull origin feature2
#From https://github.com/ishwar-soni/U-Bank
# * branch            feature2   -> FETCH_HEAD
#Already up to date.

#Ishwar.Soni@UE-B-LAP-0121 MINGW64 /d/U-Bank (feature2)
$ git pull
#Already up to date.

#Ishwar.Soni@UE-B-LAP-0121 MINGW64 /d/U-Bank (feature2)
$ git checkout feature1
#Switched to branch 'feature1'
#Your branch is up to date with 'origin/feature1'.

#Ishwar.Soni@UE-B-LAP-0121 MINGW64 /d/U-Bank (feature1)
$ git pull origin feature1
#From https://github.com/ishwar-soni/U-Bank
# * branch            feature1   -> FETCH_HEAD
#Already up to date.

#Ishwar.Soni@UE-B-LAP-0121 MINGW64 /d/U-Bank (feature1)
$ git pull origin feature1
#remote: Enumerating objects: 5, done.
#remote: Counting objects: 100% (5/5), done.
#remote: Compressing objects: 100% (3/3), done.
#remote: Total 3 (delta 1), reused 0 (delta 0), pack-reused 0
#Unpacking objects: 100% (3/3), 709 bytes | 3.00 KiB/s, done.
#From https://github.com/ishwar-soni/U-Bank
# * branch            feature1   -> FETCH_HEAD
#   648d463..b77147a  feature1   -> origin/feature1
#Updating 648d463..b77147a
#Fast-forward
# Transactions.txt | 1 +
# 1 file changed, 1 insertion(+)

#Ishwar.Soni@UE-B-LAP-0121 MINGW64 /d/U-Bank (feature1)
$ git fetch origin feature1
From https://github.com/ishwar-soni/U-Bank
 * branch            feature1   -> FETCH_HEAD

#Ishwar.Soni@UE-B-LAP-0121 MINGW64 /d/U-Bank (feature1)
$ git fetch origin feature2
#From https://github.com/ishwar-soni/U-Bank
# * branch            feature2   -> FETCH_HEAD

#Ishwar.Soni@UE-B-LAP-0121 MINGW64 /d/U-Bank (feature1)
$ git fetch origin

#Ishwar.Soni@UE-B-LAP-0121 MINGW64 /d/U-Bank (feature1)
$ git fetch --all
#Fetching origin

#Ishwar.Soni@UE-B-LAP-0121 MINGW64 /d/U-Bank (feature1)
$ git fetch --all
#Fetching origin
#remote: Enumerating objects: 5, done.
#remote: Counting objects: 100% (5/5), done.
#remote: Compressing objects: 100% (3/3), done.
#remote: Total 3 (delta 1), reused 0 (delta 0), pack-reused 0
#Unpacking objects: 100% (3/3), 710 bytes | 1024 bytes/s, done.
#From https://github.com/ishwar-soni/U-Bank
#   b77147a..f87fb8a  feature1   -> origin/feature1

#Ishwar.Soni@UE-B-LAP-0121 MINGW64 /d/U-Bank (feature1)
$ git merge
#Updating b77147a..f87fb8a
#Fast-forward
# Transactions.txt | 1 +
# 1 file changed, 1 insertion(+)

#Ishwar.Soni@UE-B-LAP-0121 MINGW64 /d/U-Bank (feature1)
$