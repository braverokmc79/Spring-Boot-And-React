<p>&nbsp;</p><p>React로 개발을 하다보면 웹팩과 바벨에 대해 많이 듣는다.</p><p>웹팩과 바벨에 대한 프로젝트는 다음 링크를 참조</p><p>1.<a target="_blank" href="https://www.skyer9.pe.kr/wordpress/?p=1498">https://www.skyer9.pe.kr/wordpress/?p=1498</a></p><p>2.<a target="_blank" href="https://berkbach.com/웹팩-webpack-과-바벨-babel-을-이용한-react-개발-환경-구성하기-fb87d0027766">https://berkbach.com/웹팩-webpack-과-바벨-babel-을-이용한-react-개발-환경-구성하기-fb87d0027766</a></p><p>&nbsp;</p><p>&nbsp;</p><p>이 게시글은 create-react-app 으로 프로젝트를&nbsp; &nbsp;진행 하였다.</p><p>참조 :create-react-app으로 쉽게 리액트 프로젝트 개발환경 구축하기</p><p><a target="_blank" href="https://velog.io/@wlsgh46/create-react-app으로-리액트-프로젝트-개발환경-구축하기">https://velog.io/@wlsgh46/create-react-app으로-리액트-프로젝트-개발환경-구축하기</a></p><p>&nbsp;</p><p>참조 :<span style="font-size:20px"><strong><span style="color:#c0392b">리액트-스프링부트-연동하여-CRUD-구현</span></strong></span></p><p><a target="_blank" href="https://corini.tistory.com/entry/리액트-스프링부트-연동하여-CRUD-구현-4-AddEdit-User-Component-생성-4n?category=836393">https://corini.tistory.com/entry/리액트-스프링부트-연동하여-CRUD-구현-4-AddEdit-User-Component-생성-4n?category=836393</a><br />&nbsp;</p><p><span style="font-size:20px"><strong><span style="color:#c0392b">소스 다운로드</span></strong></span>:&nbsp;<a target="_blank" href="https://github.com/braverokmc79/Spring-Boot-And-React/tree/main/Fusion-SpringBoot-React">https://github.com/braverokmc79/Spring-Boot-And-React/tree/main/Fusion-SpringBoot-React</a></p><p>&nbsp;</p><p>&nbsp;</p><p><strong>1.스프링 툴은 다음을 사용</strong></p><p>Version: 3.9.6.RELEASE Build Id: 201809180749 Platform: Eclipse 2018-09 (4.9.0)</p><p>Copyright (c) 2007 - 2018 Pivotal Software, Inc. All rights reserved. Visit&nbsp;<a rel="nofollow" href="http://spring.io/tools/sts">http://spring.io/tools/sts</a></p><p>This product includes software developed by the Apache Software Foundation&nbsp;<a rel="nofollow" href="http://www.apache.org/">http://www.apache.org</a></p><p>Lombok v1.18.10 &quot;Envious Ferret&quot; is installed.&nbsp;<a rel="nofollow" href="https://projectlom/">https://projectlom</a></p><p>&nbsp;</p><p><strong>2.깃 업로드시</strong></p><p>줄바꿈 오류</p><p>git config --global core.autocrlf true</p><p>git add .</p><p>git commit -m &quot;first commit&quot;</p><p>git branch -M main</p><p>git remote add origin&nbsp;<a href="https://github.com/braverokmc79/Spring-Boot-And-React.git">https://github.com/braverokmc79/Spring-Boot-And-React.git</a></p><p>git push -u origin main</p><p>&nbsp;</p><p>3.&nbsp; 명령어</p><p>서버 죽이기<br />npx kill-port 3000</p><p>시작</p><p>npm run start</p><p>또는&nbsp;&nbsp;yarn 설치후&nbsp;</p><p>yarn start</p><p>npm run build</p><p>&nbsp;</p><p>** 빌드시 참조</p><p><a target="_blank" href="https://juein.tistory.com/47">https://juein.tistory.com/47</a><br />&nbsp;</p><p>&nbsp;</p><p>&nbsp;</p><p><strong>다음 아래 내용은 그래들 기반 빌드&nbsp; 내용이다</strong></p><p><strong><a href="https://velog.io/@essri/스프링부트-리액트-프로젝트-함께-빌드하기-a1k2l5olr2">https://velog.io/@essri/스프링부트-리액트-프로젝트-함께-빌드하기-a1k2l5olr2</a></strong></p><p><strong><a target="_blank" href="https://www.hypertextcandy.com/create-react-app-on-spring-boot">https://www.hypertextcandy.com/create-react-app-on-spring-boot</a></strong></p><p>React 앱 가져 오기 만들기</p><p>&nbsp;</p><p>우선 일반적으로 Spring Initializr에서 Spring Boot 앱이 생성되는 것을 전제로합니다.</p><pre>spring-react
├─ src
│  ├─ main
│  └─ test
├─ build.gradle
└─ etc...</pre><p>프런트 엔드를 추가</p><p>여기에 다음과 같은 구성이되도록 프런트 엔드 코드를 추가합니다.</p><pre>spring-react
├─ frontend
│  ├─ src
│  ├─ node_modules
│  ├─ package.json
│  └─ etc...
├─ src
│  ├─ main
│  └─ test
├─ build.gradle
└─ etc...</pre><p>프로젝트 루트에서 다음 명령을 실행 React 응용 프로그램을 만듭니다.</p><pre>$ npx create-react-app frontend</pre><p>frontend디렉토리로 이동하여&nbsp;yarn start명령을 실행하면&nbsp;localhost:3000에서 React 응용 프로그램이 시작됩니다.</p><pre>$ cd frontend
$ yarn start</pre><p>개발시 설정</p><p>프록시</p><p><a href="https://create-react-app.dev/docs/proxying-api-requests-in-development/">설명서</a>&nbsp;에 따라 프런트 엔드에서 서버 사이드에 액세스하기위한 설정을&nbsp;package.json추가합니다.</p><p>package.json</p><pre>&quot;proxy&quot;: &quot;http://localhost:8080&quot;</pre><p>개발시 전면 localhost의 3000 번 포트 서버 사이드 8080 번 포트를 사용하고 있기 때문에 프런트 엔드에서 HTTP 요청을 8080을위한주기 위해 설정입니다.</p><p>실전 빌드</p><p>개발 환경이 갖추어졌습니다 때문에 프로덕션 환경에 배포하기위한 빌드 준비도합시다.</p><p>프런트 엔드</p><p>지금 설정&nbsp;yarn build을 실행하면 다음과 같이&nbsp;frontend디렉토리에 빌드 결과가 출력됩니다.&nbsp;그러나이 위치에 출력 되어도 Spring Boot 응용 프로그램에서 배달 할 수 없습니다.</p><pre>spring-react
├─ frontend
│  ├─ build ★
│  ├─ src
│  ├─ node_modules
│  ├─ package.json
│  └─ etc...
├─ src
├─ build.gradle
└─ etc...</pre><p>불행히도, Create React App은 대상을 정의하는 옵션은 없습니다.&nbsp;그래서&nbsp;build명령 실행 후 빌드 결과를 Spring Boot에서 제공 할 수있는 위치로 이동시키는 스크립트를 작성하게됩니다.</p><p>package.json의&nbsp;scripts에&nbsp;postbuild작업을 추가합니다.&nbsp;npm 기능으로&nbsp;postxxx는 작업을 정의하면&nbsp;xxx작업 완료 후 자동으로 실행됩니다.</p><p>frontend / package.json</p><pre>&quot;postbuild&quot;: &quot;node ./postbuild.js&quot;</pre><p>frontend/build내 파일을&nbsp;src/main/resources/public이동시키는 스크립트입니다.</p><p>frontend / postbuild.js</p><pre>const path = require(&#39;path&#39;);
const fs = require(&#39;fs-extra&#39;);

const BUILD_DIR = path.join(__dirname, &#39;./build&#39;);
const PUBLIC_DIR = path.join(__dirname, &#39;../src/main/resources/public&#39;);

fs.emptyDirSync(PUBLIC_DIR);
fs.copySync(BUILD_DIR, PUBLIC_DIR);</pre><p>src/main/resources/public빌드 결과이므로&nbsp;.gitignore이 포함 좋을 것입니다.</p><p>라우팅</p><p>다음은&nbsp;public디렉토리의 내용을 전달하기위한 컨트롤러를 만듭니다.</p><p>SinglePageController.java</p><pre>package com.hypertextcandy.react;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SinglePageController {
    @GetMapping(&quot;/**/{path:[^.]*}&quot;)
    public String any() {
        return &quot;forward:/index.html&quot;;
    }
}</pre><p>어떤 URL로 요청이 와도&nbsp;index.html을 반환하는 컨트롤러입니다.&nbsp;SPA에서는 화면 측의 라우팅 (URL과 표시 내용의 끈 절임)는 프론트 엔드에서 실시하므로, 서버 사이드&nbsp;index.html를 응답하면 OK라는 것입니다.</p><p>Gradle</p><p>이대로 가다가는 결국 응용 프로그램을 빌드 할 때 프런트 엔드에 yarn 빌드 명령 및 서버 측에 Gradle 빌드 명령을 두 실행해야 안됩니다.</p><p>그것으로 문제는 없지만, Gradle에서 프런트 엔드 빌드도 함께 할 수있는 설정을 소개합니다.</p><p>Gradle에서 yarn 명령을 호출하기 때문에&nbsp;<a href="https://github.com/srs/gradle-node-plugin">gradle-node-plugin</a>&nbsp;을 사용합니다.&nbsp;plugins한줄 (★) 추가 플러그인을 설치합니다.</p><p>build.gradle</p><pre>plugins {
    id &#39;org.springframework.boot&#39; version &#39;2.2.2.RELEASE&#39;
    id &#39;io.spring.dependency-management&#39; version &#39;1.0.8.RELEASE&#39;
    id &#39;java&#39;
    id &quot;com.moowork.node&quot; version &quot;1.3.1&quot; // ★ 追加
}</pre><p>gradle-node-plugin의&nbsp;<a href="https://github.com/srs/gradle-node-plugin/blob/master/docs/node.md#executing-yarn-tasks">문서</a>&nbsp;를 참조하여 다음 작업을 추기합니다.&nbsp;작업 디렉토리를&nbsp;./frontend로 옮겨&nbsp;yarn build을 수행한다는 내용입니다.</p><p>build.gradle</p><pre>task buildReact(type: YarnTask) {
    execOverrides {
        it.workingDir = &#39;./frontend&#39;
    }
    args = [&#39;build&#39;]
}</pre><p>yarn 대신 npm을 사용하는 경우에 게시판 문서를 참고로 바꿔줍니다.</p><p>또한 특정 Gradle 작업 전에 위의&nbsp;buildReact작업을 수행하려면 다음 계정을 추가합니다.</p><p>build.gradle</p><pre>build.dependsOn buildReact</pre><p>이&nbsp;build작업을 실행하기 전에&nbsp;buildReact실행한다는 지정합니다.</p><p>&nbsp;</p><p>이상, Spring Boot 응용 프로그램에 Create React App을 결합하여 단일 페이지 응용 프로그램 환경을 구축하는 방법을 소개했습니다.</p><p>&nbsp;</p><p>&nbsp;</p><p>&nbsp;</p><p><span style="font-size:24px"><span style="color:#2980b9"><strong>* 요약</strong></span></span></p><p>&nbsp;</p><p>아래 이미지 처럼 프론트 디렉토리에서 개발을 진행</p><p><img alt="" width="900" height="493" src="https://1.bp.blogspot.com/-E9DRBPBuznI/YONWW-gyDaI/AAAAAAAAFgA/lRrlRJubL000YEe7t9oIWzG_TS-90-8AQCLcBGAsYHQ/s1900/1.png" /></p><p>&nbsp;</p><p>3000 포트 번호로&nbsp; 결과물 확인</p><p>&nbsp;</p><p><img alt="" width="900" height="489" src="https://1.bp.blogspot.com/-NK53BhcGFfQ/YONVB-d2zaI/AAAAAAAAFfo/Tx8dLWhxBn4YZqXooEZUiMlj3s3JEP3BwCLcBGAsYHQ/s1619/2.png" /></p><p>&nbsp;</p><p>&nbsp;</p><p>다음 코드로 인하여&nbsp;백엔드는 8080 포트로 확인 가능하다&nbsp;</p><pre class="brush:java;">/**
 * 
 * 
 * 다음은 public디렉토리의 내용을 전달하기위한 컨트롤러를 만듭니다.
 * 어떤 URL로 요청이 와도 index.html을 반환하는 컨트롤러입니다. 
 * SPA에서는 화면 측의 라우팅 (URL과 표시 내용의 끈 절임)는 프론트 엔드에서 실시하므로,
 * 서버 사이드 index.html를 응답하면 OK라는 것입니다.
 * 
 * 
 */
@Controller
public class SinglePageController {
    //@GetMapping(&quot;/**/{path:[^.]*}&quot;)
    public String any() {
        return &quot;forward:/index.html&quot;;
    }
    
    @GetMapping(&quot;/api/{path:[^.]*}&quot;)
    public String anyApi() {
        return &quot;forward:/index.html&quot;;
    }
    
    
}</pre><p>&nbsp;</p><p><img alt="" width="900" height="506" src="https://1.bp.blogspot.com/-LF0KQVYqqF8/YONVDPbAVcI/AAAAAAAAFfs/vnaCyyjIg0Ad-EDhzn4M4cAmEIMA4soQwCLcBGAsYHQ/s1638/3.png" /></p><p>&nbsp;</p><p>&nbsp;</p><p>&nbsp;</p><p>&nbsp;</p><p>&nbsp;</p><p><span style="font-size:24px"><span style="color:#2980b9"><strong><img alt="" width="900" height="535" src="https://1.bp.blogspot.com/-jslYYF9H8Y8/YONU97lMsFI/AAAAAAAAFfc/jR9UGXMrxVYeEvLaM8JofmhnCLL3T1b0gCLcBGAsYHQ/s1390/spring%2Bbooot-%2Breact.png" /></strong></span></span></p><p>&nbsp;</p><p><img alt="" width="900" height="437" src="https://1.bp.blogspot.com/-hApayCzATgE/YONU_cTBmaI/AAAAAAAAFfg/VxaqhwVIt6g5p3o2BCh98cwZilYwpQfhwCLcBGAsYHQ/s1876/build.png" /></p><p>&nbsp;</p><p>&nbsp;</p><p>&nbsp;</p><p>&nbsp;</p><p>&nbsp;</p><p>&nbsp;</p><p>&nbsp;</p><p>&nbsp;</p><p>&nbsp;</p><p>&nbsp;</p><p>&nbsp;</p><p>&nbsp;</p><p>&nbsp;</p><p>&nbsp;</p><p>&nbsp;</p><p>&nbsp;</p>
