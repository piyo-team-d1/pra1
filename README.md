Travis CI メモ

# Travisって何
公式ドキュメント
[(url)](https://docs.travis-ci.com/user/getting-started/)  
GitHubと連携できる継続的インテグレーションツール「Travis CI」入門
[(url)](https://knowledge.sakura.ad.jp/3754/)  
  
### travisで何をするの?CIって何?
Travis CI 入門：GitHub + Travis CI で継続的インテグレーション
[(url)](http://tetsuwo.tumblr.com/post/44706350593/github-travis-continuous-integration)  


# .travis.ymlって何
公式ドキュメント
[(url)](https://docs.travis-ci.com/user/customizing-the-build/)  
Travis CI: .travis.yml 記述例
[(url)](https://gist.github.com/spiegel-im-spiegel/2e9ebb6e5d7a8bf20f8d)	

##### .ymlに各ステップごとのスクリプトを書くといろいろ実行できるらしい
	

**インストール**

	1. before_installステップ
	2. installステップ  

**スクリプト実行**

	3. before_scriptステップ
	4. scriptステップ  
		ここでテスト??	
	5. after_sucessもしくはafter_failureステップ	
		テスト結果で分岐??	
**デプロイ**

	6. before_deployステップ
	7. deployステップ
	8. after_deployステップ
	9. after_script


# webhookって何
調べてません
