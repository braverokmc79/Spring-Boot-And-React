/* 

1. frontend/build내 파일을 src/main/resources/public이동시키는 스크립트입니다.
https://www.hypertextcandy.com/create-react-app-on-spring-boot


2. [React] create-react-app 작업 내용을 build 하기
출처: https://juein.tistory.com/47 [juein]

*/




const path = require('path');
const fs = require('fs-extra');

const BUILD_DIR = path.join(__dirname, './build');
const PUBLIC_DIR = path.join(__dirname, '../src/main/resources/public');

fs.emptyDirSync(PUBLIC_DIR);
fs.copySync(BUILD_DIR, PUBLIC_DIR);