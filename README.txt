Drools PalyGround

1. Create Project

 mvn archetype:generate -DarchetypeGroupId=org.apache.maven.archetypes -DarchetypeArtifactId=maven-archetype-quickstart -DgroupId=jp.co.fujisan.k_ueno -DartifactId=drools_playground -Dversion=0.0.1

2. Drools用設定追加

2.1 リソースディレクトリを作成

  mkdir -p resources/META-INF
  mkdir -p resources/rules

2.2 pom.xml編集
  drools関連のライブラリを追加

