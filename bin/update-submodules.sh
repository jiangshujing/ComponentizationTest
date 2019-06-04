#!/bin/bash
grep path .gitmodules | awk '{ print $3 }' > /tmp/study-git-submodule-dirs

# read
while read LINE
do
    echo $LINE
    (cd ./$LINE && git checkout master && git pull)
done < /tmp/study-git-submodule-dirs


# 脚本使用步骤
# 1.项目根目录创建 bin,将脚本文件添加进去
# 2. chmod +x ./bin/update-submodules.sh  //添加权限
# 3. ./bin/update-submodules.sh