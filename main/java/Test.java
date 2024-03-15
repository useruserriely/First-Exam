public class Test {
    public static void main(String[] args) {
        (git new repository 생성 후 commit)
        rm -rf .git
        cd src
        git init
        git status
        git add .
        git config user.email "psy1004.syp@gmail.com"
        git config user.name "useruserriely"
        git commit -m "java day00"
        git remote add origin 주소
        git push -u origin main
    }
}

