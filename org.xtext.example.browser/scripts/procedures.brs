webBrowser firefox
	open
		onglet : "http://campus.mines-nantes.fr"
		memorise Button "Connexion" in "button"
		memorise Text "HelloWord" in "sometext"
		
		procedure ProcedureName with Params
			"username" "mtis" "password" "12345" "Connexion"
			fillTextField arg1 with arg2
			fillTextField arg3 with arg4
			clickOnButton arg5
		endProcedure
		
	close