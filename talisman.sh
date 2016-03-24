printf "refs/heads/master/ " 
lastCommit="$(git rev-parse HEAD)"
printf $lastCommit
printf " refs/heads/master/ "
firstCommit="$(git rev-list HEAD | tail -n 1)"
printf $firstCommit

