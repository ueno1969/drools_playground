Drools PalyGround

1. Create Project

 mvn archetype:generate -DarchetypeGroupId=org.apache.maven.archetypes -DarchetypeArtifactId=maven-archetype-quickstart -DgroupId=jp.co.fujisan.k_ueno -DartifactId=drools_playground -Dversion=0.0.1

2. Drools用設定追加

2.1 リソースディレクトリを作成

  mkdir -p src/main/resources/META-INF
  mkdir -p src/main/resources/rules

2.2 pom.xml編集
  drools関連のライブラリを追加

3. テストプログラム作成

- resources/META-INF/kmodule.xmlでルールの場所を指定
- 適当なサンプルプログラムを用意

3.1 実行

  $ mvn compile
  $ mvn exec:java
