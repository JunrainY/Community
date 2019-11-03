## Yl的第一个spring

## 资料
[](https://spring.io/guides/)
[]https://spring.io/guides/gs/serving-web-content/

## 先放暂存    git add . "黄色"
## 再放入      git status "红色"
## 备注          git commit -m " ***"
## 更改后再追加 git commit  --amend --no-edit
如果出现! [rejected] master -> master (non-fast forward)
1、git pull origin master --allow-unrelated-histories //把远程仓库和本地同步，消除差异

2、重新git add .和git commit -m ""相应文件

3、git push origin master
## https://developer.github.com/apps/building-oauth-apps/creating-an-oauth-app/