// Generated from com/facebook/presto/sql/parser/SqlBase.g4 by ANTLR 4.5.1
package com.facebook.presto.sql.parser;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SqlBaseParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, SELECT=9, 
		FROM=10, ADD=11, AS=12, ALL=13, SOME=14, ANY=15, DISTINCT=16, WHERE=17, 
		GROUP=18, BY=19, GROUPING=20, SETS=21, CUBE=22, ROLLUP=23, ORDER=24, HAVING=25, 
		LIMIT=26, APPROXIMATE=27, AT=28, CONFIDENCE=29, OR=30, AND=31, IN=32, 
		NOT=33, NO=34, EXISTS=35, BETWEEN=36, LIKE=37, IS=38, NULL=39, TRUE=40, 
		FALSE=41, NULLS=42, FIRST=43, LAST=44, ESCAPE=45, ASC=46, DESC=47, SUBSTRING=48, 
		POSITION=49, FOR=50, TINYINT=51, SMALLINT=52, INTEGER=53, DATE=54, TIME=55, 
		TIMESTAMP=56, INTERVAL=57, YEAR=58, MONTH=59, DAY=60, HOUR=61, MINUTE=62, 
		SECOND=63, ZONE=64, CURRENT_DATE=65, CURRENT_TIME=66, CURRENT_TIMESTAMP=67, 
		LOCALTIME=68, LOCALTIMESTAMP=69, EXTRACT=70, CASE=71, WHEN=72, THEN=73, 
		ELSE=74, END=75, JOIN=76, CROSS=77, OUTER=78, INNER=79, LEFT=80, RIGHT=81, 
		FULL=82, NATURAL=83, USING=84, ON=85, OVER=86, PARTITION=87, RANGE=88, 
		ROWS=89, UNBOUNDED=90, PRECEDING=91, FOLLOWING=92, CURRENT=93, ROW=94, 
		WITH=95, RECURSIVE=96, VALUES=97, CREATE=98, TABLE=99, VIEW=100, REPLACE=101, 
		INSERT=102, DELETE=103, INTO=104, CONSTRAINT=105, DESCRIBE=106, GRANT=107, 
		REVOKE=108, PRIVILEGES=109, PUBLIC=110, OPTION=111, EXPLAIN=112, ANALYZE=113, 
		FORMAT=114, TYPE=115, TEXT=116, GRAPHVIZ=117, LOGICAL=118, DISTRIBUTED=119, 
		TRY=120, CAST=121, TRY_CAST=122, SHOW=123, TABLES=124, SCHEMAS=125, CATALOGS=126, 
		COLUMNS=127, COLUMN=128, USE=129, PARTITIONS=130, FUNCTIONS=131, DROP=132, 
		UNION=133, EXCEPT=134, INTERSECT=135, TO=136, SYSTEM=137, BERNOULLI=138, 
		POISSONIZED=139, TABLESAMPLE=140, RESCALED=141, STRATIFY=142, ALTER=143, 
		RENAME=144, UNNEST=145, ORDINALITY=146, ARRAY=147, MAP=148, SET=149, RESET=150, 
		SESSION=151, DATA=152, START=153, TRANSACTION=154, COMMIT=155, ROLLBACK=156, 
		WORK=157, ISOLATION=158, LEVEL=159, SERIALIZABLE=160, REPEATABLE=161, 
		COMMITTED=162, UNCOMMITTED=163, READ=164, WRITE=165, ONLY=166, CALL=167, 
		PREPARE=168, DEALLOCATE=169, EXECUTE=170, NORMALIZE=171, NFD=172, NFC=173, 
		NFKD=174, NFKC=175, IF=176, NULLIF=177, COALESCE=178, EQ=179, NEQ=180, 
		LT=181, LTE=182, GT=183, GTE=184, PLUS=185, MINUS=186, ASTERISK=187, SLASH=188, 
		PERCENT=189, CONCAT=190, STRING=191, BINARY_LITERAL=192, INTEGER_VALUE=193, 
		DECIMAL_VALUE=194, IDENTIFIER=195, DIGIT_IDENTIFIER=196, QUOTED_IDENTIFIER=197, 
		BACKQUOTED_IDENTIFIER=198, TIME_WITH_TIME_ZONE=199, TIMESTAMP_WITH_TIME_ZONE=200, 
		SIMPLE_COMMENT=201, BRACKETED_COMMENT=202, WS=203, UNRECOGNIZED=204, DELIMITER=205;
	public static final int
		RULE_singleStatement = 0, RULE_singleExpression = 1, RULE_statement = 2, 
		RULE_query = 3, RULE_with = 4, RULE_tableElement = 5, RULE_tableProperties = 6, 
		RULE_tableProperty = 7, RULE_queryNoWith = 8, RULE_queryTerm = 9, RULE_queryPrimary = 10, 
		RULE_sortItem = 11, RULE_querySpecification = 12, RULE_groupBy = 13, RULE_groupingElement = 14, 
		RULE_groupingExpressions = 15, RULE_groupingSet = 16, RULE_namedQuery = 17, 
		RULE_setQuantifier = 18, RULE_selectItem = 19, RULE_relation = 20, RULE_joinType = 21, 
		RULE_joinCriteria = 22, RULE_sampledRelation = 23, RULE_sampleType = 24, 
		RULE_aliasedRelation = 25, RULE_columnAliases = 26, RULE_relationPrimary = 27, 
		RULE_expression = 28, RULE_booleanExpression = 29, RULE_predicated = 30, 
		RULE_predicate = 31, RULE_valueExpression = 32, RULE_primaryExpression = 33, 
		RULE_timeZoneSpecifier = 34, RULE_comparisonOperator = 35, RULE_booleanValue = 36, 
		RULE_interval = 37, RULE_intervalField = 38, RULE_type = 39, RULE_typeParameter = 40, 
		RULE_baseType = 41, RULE_whenClause = 42, RULE_over = 43, RULE_windowFrame = 44, 
		RULE_frameBound = 45, RULE_explainOption = 46, RULE_transactionMode = 47, 
		RULE_levelOfIsolation = 48, RULE_callArgument = 49, RULE_privilege = 50, 
		RULE_qualifiedName = 51, RULE_identifier = 52, RULE_quotedIdentifier = 53, 
		RULE_number = 54, RULE_nonReserved = 55, RULE_normalForm = 56;
	public static final String[] ruleNames = {
		"singleStatement", "singleExpression", "statement", "query", "with", "tableElement", 
		"tableProperties", "tableProperty", "queryNoWith", "queryTerm", "queryPrimary", 
		"sortItem", "querySpecification", "groupBy", "groupingElement", "groupingExpressions", 
		"groupingSet", "namedQuery", "setQuantifier", "selectItem", "relation", 
		"joinType", "joinCriteria", "sampledRelation", "sampleType", "aliasedRelation", 
		"columnAliases", "relationPrimary", "expression", "booleanExpression", 
		"predicated", "predicate", "valueExpression", "primaryExpression", "timeZoneSpecifier", 
		"comparisonOperator", "booleanValue", "interval", "intervalField", "type", 
		"typeParameter", "baseType", "whenClause", "over", "windowFrame", "frameBound", 
		"explainOption", "transactionMode", "levelOfIsolation", "callArgument", 
		"privilege", "qualifiedName", "identifier", "quotedIdentifier", "number", 
		"nonReserved", "normalForm"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'.'", "'('", "','", "')'", "'->'", "'['", "']'", "'=>'", "'SELECT'", 
		"'FROM'", "'ADD'", "'AS'", "'ALL'", "'SOME'", "'ANY'", "'DISTINCT'", "'WHERE'", 
		"'GROUP'", "'BY'", "'GROUPING'", "'SETS'", "'CUBE'", "'ROLLUP'", "'ORDER'", 
		"'HAVING'", "'LIMIT'", "'APPROXIMATE'", "'AT'", "'CONFIDENCE'", "'OR'", 
		"'AND'", "'IN'", "'NOT'", "'NO'", "'EXISTS'", "'BETWEEN'", "'LIKE'", "'IS'", 
		"'NULL'", "'TRUE'", "'FALSE'", "'NULLS'", "'FIRST'", "'LAST'", "'ESCAPE'", 
		"'ASC'", "'DESC'", "'SUBSTRING'", "'POSITION'", "'FOR'", "'TINYINT'", 
		"'SMALLINT'", "'INTEGER'", "'DATE'", "'TIME'", "'TIMESTAMP'", "'INTERVAL'", 
		"'YEAR'", "'MONTH'", "'DAY'", "'HOUR'", "'MINUTE'", "'SECOND'", "'ZONE'", 
		"'CURRENT_DATE'", "'CURRENT_TIME'", "'CURRENT_TIMESTAMP'", "'LOCALTIME'", 
		"'LOCALTIMESTAMP'", "'EXTRACT'", "'CASE'", "'WHEN'", "'THEN'", "'ELSE'", 
		"'END'", "'JOIN'", "'CROSS'", "'OUTER'", "'INNER'", "'LEFT'", "'RIGHT'", 
		"'FULL'", "'NATURAL'", "'USING'", "'ON'", "'OVER'", "'PARTITION'", "'RANGE'", 
		"'ROWS'", "'UNBOUNDED'", "'PRECEDING'", "'FOLLOWING'", "'CURRENT'", "'ROW'", 
		"'WITH'", "'RECURSIVE'", "'VALUES'", "'CREATE'", "'TABLE'", "'VIEW'", 
		"'REPLACE'", "'INSERT'", "'DELETE'", "'INTO'", "'CONSTRAINT'", "'DESCRIBE'", 
		"'GRANT'", "'REVOKE'", "'PRIVILEGES'", "'PUBLIC'", "'OPTION'", "'EXPLAIN'", 
		"'ANALYZE'", "'FORMAT'", "'TYPE'", "'TEXT'", "'GRAPHVIZ'", "'LOGICAL'", 
		"'DISTRIBUTED'", "'TRY'", "'CAST'", "'TRY_CAST'", "'SHOW'", "'TABLES'", 
		"'SCHEMAS'", "'CATALOGS'", "'COLUMNS'", "'COLUMN'", "'USE'", "'PARTITIONS'", 
		"'FUNCTIONS'", "'DROP'", "'UNION'", "'EXCEPT'", "'INTERSECT'", "'TO'", 
		"'SYSTEM'", "'BERNOULLI'", "'POISSONIZED'", "'TABLESAMPLE'", "'RESCALED'", 
		"'STRATIFY'", "'ALTER'", "'RENAME'", "'UNNEST'", "'ORDINALITY'", "'ARRAY'", 
		"'MAP'", "'SET'", "'RESET'", "'SESSION'", "'DATA'", "'START'", "'TRANSACTION'", 
		"'COMMIT'", "'ROLLBACK'", "'WORK'", "'ISOLATION'", "'LEVEL'", "'SERIALIZABLE'", 
		"'REPEATABLE'", "'COMMITTED'", "'UNCOMMITTED'", "'READ'", "'WRITE'", "'ONLY'", 
		"'CALL'", "'PREPARE'", "'DEALLOCATE'", "'EXECUTE'", "'NORMALIZE'", "'NFD'", 
		"'NFC'", "'NFKD'", "'NFKC'", "'IF'", "'NULLIF'", "'COALESCE'", "'='", 
		null, "'<'", "'<='", "'>'", "'>='", "'+'", "'-'", "'*'", "'/'", "'%'", 
		"'||'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, "SELECT", "FROM", 
		"ADD", "AS", "ALL", "SOME", "ANY", "DISTINCT", "WHERE", "GROUP", "BY", 
		"GROUPING", "SETS", "CUBE", "ROLLUP", "ORDER", "HAVING", "LIMIT", "APPROXIMATE", 
		"AT", "CONFIDENCE", "OR", "AND", "IN", "NOT", "NO", "EXISTS", "BETWEEN", 
		"LIKE", "IS", "NULL", "TRUE", "FALSE", "NULLS", "FIRST", "LAST", "ESCAPE", 
		"ASC", "DESC", "SUBSTRING", "POSITION", "FOR", "TINYINT", "SMALLINT", 
		"INTEGER", "DATE", "TIME", "TIMESTAMP", "INTERVAL", "YEAR", "MONTH", "DAY", 
		"HOUR", "MINUTE", "SECOND", "ZONE", "CURRENT_DATE", "CURRENT_TIME", "CURRENT_TIMESTAMP", 
		"LOCALTIME", "LOCALTIMESTAMP", "EXTRACT", "CASE", "WHEN", "THEN", "ELSE", 
		"END", "JOIN", "CROSS", "OUTER", "INNER", "LEFT", "RIGHT", "FULL", "NATURAL", 
		"USING", "ON", "OVER", "PARTITION", "RANGE", "ROWS", "UNBOUNDED", "PRECEDING", 
		"FOLLOWING", "CURRENT", "ROW", "WITH", "RECURSIVE", "VALUES", "CREATE", 
		"TABLE", "VIEW", "REPLACE", "INSERT", "DELETE", "INTO", "CONSTRAINT", 
		"DESCRIBE", "GRANT", "REVOKE", "PRIVILEGES", "PUBLIC", "OPTION", "EXPLAIN", 
		"ANALYZE", "FORMAT", "TYPE", "TEXT", "GRAPHVIZ", "LOGICAL", "DISTRIBUTED", 
		"TRY", "CAST", "TRY_CAST", "SHOW", "TABLES", "SCHEMAS", "CATALOGS", "COLUMNS", 
		"COLUMN", "USE", "PARTITIONS", "FUNCTIONS", "DROP", "UNION", "EXCEPT", 
		"INTERSECT", "TO", "SYSTEM", "BERNOULLI", "POISSONIZED", "TABLESAMPLE", 
		"RESCALED", "STRATIFY", "ALTER", "RENAME", "UNNEST", "ORDINALITY", "ARRAY", 
		"MAP", "SET", "RESET", "SESSION", "DATA", "START", "TRANSACTION", "COMMIT", 
		"ROLLBACK", "WORK", "ISOLATION", "LEVEL", "SERIALIZABLE", "REPEATABLE", 
		"COMMITTED", "UNCOMMITTED", "READ", "WRITE", "ONLY", "CALL", "PREPARE", 
		"DEALLOCATE", "EXECUTE", "NORMALIZE", "NFD", "NFC", "NFKD", "NFKC", "IF", 
		"NULLIF", "COALESCE", "EQ", "NEQ", "LT", "LTE", "GT", "GTE", "PLUS", "MINUS", 
		"ASTERISK", "SLASH", "PERCENT", "CONCAT", "STRING", "BINARY_LITERAL", 
		"INTEGER_VALUE", "DECIMAL_VALUE", "IDENTIFIER", "DIGIT_IDENTIFIER", "QUOTED_IDENTIFIER", 
		"BACKQUOTED_IDENTIFIER", "TIME_WITH_TIME_ZONE", "TIMESTAMP_WITH_TIME_ZONE", 
		"SIMPLE_COMMENT", "BRACKETED_COMMENT", "WS", "UNRECOGNIZED", "DELIMITER"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "SqlBase.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SqlBaseParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class SingleStatementContext extends ParserRuleContext {
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public SingleStatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleStatement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSingleStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSingleStatement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSingleStatement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleStatementContext singleStatement() throws RecognitionException {
		SingleStatementContext _localctx = new SingleStatementContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_singleStatement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			statement();
			setState(115);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SingleExpressionContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SqlBaseParser.EOF, 0); }
		public SingleExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_singleExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSingleExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSingleExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSingleExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SingleExpressionContext singleExpression() throws RecognitionException {
		SingleExpressionContext _localctx = new SingleExpressionContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_singleExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(117);
			expression();
			setState(118);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	 
		public StatementContext() { }
		public void copyFrom(StatementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExplainContext extends StatementContext {
		public TerminalNode EXPLAIN() { return getToken(SqlBaseParser.EXPLAIN, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public TerminalNode ANALYZE() { return getToken(SqlBaseParser.ANALYZE, 0); }
		public List<ExplainOptionContext> explainOption() {
			return getRuleContexts(ExplainOptionContext.class);
		}
		public ExplainOptionContext explainOption(int i) {
			return getRuleContext(ExplainOptionContext.class,i);
		}
		public ExplainContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterExplain(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitExplain(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitExplain(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PrepareContext extends StatementContext {
		public TerminalNode PREPARE() { return getToken(SqlBaseParser.PREPARE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public StatementContext statement() {
			return getRuleContext(StatementContext.class,0);
		}
		public PrepareContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPrepare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPrepare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPrepare(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateTableContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public List<TableElementContext> tableElement() {
			return getRuleContexts(TableElementContext.class);
		}
		public TableElementContext tableElement(int i) {
			return getRuleContext(TableElementContext.class,i);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TablePropertiesContext tableProperties() {
			return getRuleContext(TablePropertiesContext.class,0);
		}
		public CreateTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StartTransactionContext extends StatementContext {
		public TerminalNode START() { return getToken(SqlBaseParser.START, 0); }
		public TerminalNode TRANSACTION() { return getToken(SqlBaseParser.TRANSACTION, 0); }
		public List<TransactionModeContext> transactionMode() {
			return getRuleContexts(TransactionModeContext.class);
		}
		public TransactionModeContext transactionMode(int i) {
			return getRuleContext(TransactionModeContext.class,i);
		}
		public StartTransactionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterStartTransaction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitStartTransaction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitStartTransaction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateTableAsSelectContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public List<TerminalNode> WITH() { return getTokens(SqlBaseParser.WITH); }
		public TerminalNode WITH(int i) {
			return getToken(SqlBaseParser.WITH, i);
		}
		public TablePropertiesContext tableProperties() {
			return getRuleContext(TablePropertiesContext.class,0);
		}
		public TerminalNode DATA() { return getToken(SqlBaseParser.DATA, 0); }
		public TerminalNode NO() { return getToken(SqlBaseParser.NO, 0); }
		public CreateTableAsSelectContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateTableAsSelect(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateTableAsSelect(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateTableAsSelect(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UseContext extends StatementContext {
		public IdentifierContext schema;
		public IdentifierContext catalog;
		public TerminalNode USE() { return getToken(SqlBaseParser.USE, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public UseContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterUse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitUse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitUse(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeallocateContext extends StatementContext {
		public TerminalNode DEALLOCATE() { return getToken(SqlBaseParser.DEALLOCATE, 0); }
		public TerminalNode PREPARE() { return getToken(SqlBaseParser.PREPARE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DeallocateContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDeallocate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDeallocate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDeallocate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RenameTableContext extends StatementContext {
		public QualifiedNameContext from;
		public QualifiedNameContext to;
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode RENAME() { return getToken(SqlBaseParser.RENAME, 0); }
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public RenameTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRenameTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRenameTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRenameTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CommitContext extends StatementContext {
		public TerminalNode COMMIT() { return getToken(SqlBaseParser.COMMIT, 0); }
		public TerminalNode WORK() { return getToken(SqlBaseParser.WORK, 0); }
		public CommitContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCommit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCommit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCommit(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RevokeContext extends StatementContext {
		public IdentifierContext grantee;
		public TerminalNode REVOKE() { return getToken(SqlBaseParser.REVOKE, 0); }
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<PrivilegeContext> privilege() {
			return getRuleContexts(PrivilegeContext.class);
		}
		public PrivilegeContext privilege(int i) {
			return getRuleContext(PrivilegeContext.class,i);
		}
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public TerminalNode PRIVILEGES() { return getToken(SqlBaseParser.PRIVILEGES, 0); }
		public TerminalNode GRANT() { return getToken(SqlBaseParser.GRANT, 0); }
		public TerminalNode OPTION() { return getToken(SqlBaseParser.OPTION, 0); }
		public TerminalNode FOR() { return getToken(SqlBaseParser.FOR, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public RevokeContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRevoke(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRevoke(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRevoke(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowPartitionsContext extends StatementContext {
		public Token limit;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode PARTITIONS() { return getToken(SqlBaseParser.PARTITIONS, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public TerminalNode WHERE() { return getToken(SqlBaseParser.WHERE, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public TerminalNode ORDER() { return getToken(SqlBaseParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public List<SortItemContext> sortItem() {
			return getRuleContexts(SortItemContext.class);
		}
		public SortItemContext sortItem(int i) {
			return getRuleContext(SortItemContext.class,i);
		}
		public TerminalNode LIMIT() { return getToken(SqlBaseParser.LIMIT, 0); }
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public ShowPartitionsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowPartitions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowPartitions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowPartitions(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropViewContext extends StatementContext {
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public DropViewContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDropView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDropView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDropView(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DeleteContext extends StatementContext {
		public TerminalNode DELETE() { return getToken(SqlBaseParser.DELETE, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode WHERE() { return getToken(SqlBaseParser.WHERE, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public DeleteContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDelete(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDelete(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDelete(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowTablesContext extends StatementContext {
		public Token pattern;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode TABLES() { return getToken(SqlBaseParser.TABLES, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public ShowTablesContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowTables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowTables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowTables(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowCatalogsContext extends StatementContext {
		public Token pattern;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode CATALOGS() { return getToken(SqlBaseParser.CATALOGS, 0); }
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public ShowCatalogsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowCatalogs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowCatalogs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowCatalogs(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StatementDefaultContext extends StatementContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public StatementDefaultContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterStatementDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitStatementDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitStatementDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RenameColumnContext extends StatementContext {
		public QualifiedNameContext tableName;
		public IdentifierContext from;
		public IdentifierContext to;
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode RENAME() { return getToken(SqlBaseParser.RENAME, 0); }
		public TerminalNode COLUMN() { return getToken(SqlBaseParser.COLUMN, 0); }
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public RenameColumnContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRenameColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRenameColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRenameColumn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetSessionContext extends StatementContext {
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode SESSION() { return getToken(SqlBaseParser.SESSION, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode EQ() { return getToken(SqlBaseParser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SetSessionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetSession(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetSession(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetSession(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CreateViewContext extends StatementContext {
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public CreateViewContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCreateView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCreateView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCreateView(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowCreateTableContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ShowCreateTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowCreateTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowCreateTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowCreateTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowSchemasContext extends StatementContext {
		public Token pattern;
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode SCHEMAS() { return getToken(SqlBaseParser.SCHEMAS, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public ShowSchemasContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowSchemas(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowSchemas(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowSchemas(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DropTableContext extends StatementContext {
		public TerminalNode DROP() { return getToken(SqlBaseParser.DROP, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public DropTableContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDropTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDropTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDropTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowColumnsContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public TerminalNode DESCRIBE() { return getToken(SqlBaseParser.DESCRIBE, 0); }
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public ShowColumnsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowColumns(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowColumns(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowColumns(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RollbackContext extends StatementContext {
		public TerminalNode ROLLBACK() { return getToken(SqlBaseParser.ROLLBACK, 0); }
		public TerminalNode WORK() { return getToken(SqlBaseParser.WORK, 0); }
		public RollbackContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRollback(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRollback(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRollback(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddColumnContext extends StatementContext {
		public QualifiedNameContext tableName;
		public TableElementContext column;
		public TerminalNode ALTER() { return getToken(SqlBaseParser.ALTER, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode ADD() { return getToken(SqlBaseParser.ADD, 0); }
		public TerminalNode COLUMN() { return getToken(SqlBaseParser.COLUMN, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TableElementContext tableElement() {
			return getRuleContext(TableElementContext.class,0);
		}
		public AddColumnContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAddColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAddColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAddColumn(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ResetSessionContext extends StatementContext {
		public TerminalNode RESET() { return getToken(SqlBaseParser.RESET, 0); }
		public TerminalNode SESSION() { return getToken(SqlBaseParser.SESSION, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ResetSessionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterResetSession(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitResetSession(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitResetSession(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InsertIntoContext extends StatementContext {
		public TerminalNode INSERT() { return getToken(SqlBaseParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(SqlBaseParser.INTO, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public ColumnAliasesContext columnAliases() {
			return getRuleContext(ColumnAliasesContext.class,0);
		}
		public InsertIntoContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInsertInto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInsertInto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInsertInto(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowSessionContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode SESSION() { return getToken(SqlBaseParser.SESSION, 0); }
		public ShowSessionContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowSession(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowSession(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowSession(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExecuteContext extends StatementContext {
		public TerminalNode EXECUTE() { return getToken(SqlBaseParser.EXECUTE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExecuteContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterExecute(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitExecute(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitExecute(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CallContext extends StatementContext {
		public TerminalNode CALL() { return getToken(SqlBaseParser.CALL, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public List<CallArgumentContext> callArgument() {
			return getRuleContexts(CallArgumentContext.class);
		}
		public CallArgumentContext callArgument(int i) {
			return getRuleContext(CallArgumentContext.class,i);
		}
		public CallContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowFunctionsContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode FUNCTIONS() { return getToken(SqlBaseParser.FUNCTIONS, 0); }
		public ShowFunctionsContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowFunctions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowFunctions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowFunctions(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class GrantContext extends StatementContext {
		public IdentifierContext grantee;
		public List<TerminalNode> GRANT() { return getTokens(SqlBaseParser.GRANT); }
		public TerminalNode GRANT(int i) {
			return getToken(SqlBaseParser.GRANT, i);
		}
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public List<PrivilegeContext> privilege() {
			return getRuleContexts(PrivilegeContext.class);
		}
		public PrivilegeContext privilege(int i) {
			return getRuleContext(PrivilegeContext.class,i);
		}
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public TerminalNode PRIVILEGES() { return getToken(SqlBaseParser.PRIVILEGES, 0); }
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TerminalNode OPTION() { return getToken(SqlBaseParser.OPTION, 0); }
		public GrantContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterGrant(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitGrant(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitGrant(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ShowCreateViewContext extends StatementContext {
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode CREATE() { return getToken(SqlBaseParser.CREATE, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public ShowCreateViewContext(StatementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterShowCreateView(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitShowCreateView(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitShowCreateView(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_statement);
		int _la;
		try {
			setState(426);
			switch ( getInterpreter().adaptivePredict(_input,38,_ctx) ) {
			case 1:
				_localctx = new StatementDefaultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(120);
				query();
				}
				break;
			case 2:
				_localctx = new UseContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(121);
				match(USE);
				setState(122);
				((UseContext)_localctx).schema = identifier();
				}
				break;
			case 3:
				_localctx = new UseContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(123);
				match(USE);
				setState(124);
				((UseContext)_localctx).catalog = identifier();
				setState(125);
				match(T__0);
				setState(126);
				((UseContext)_localctx).schema = identifier();
				}
				break;
			case 4:
				_localctx = new CreateTableAsSelectContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(128);
				match(CREATE);
				setState(129);
				match(TABLE);
				setState(133);
				switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
				case 1:
					{
					setState(130);
					match(IF);
					setState(131);
					match(NOT);
					setState(132);
					match(EXISTS);
					}
					break;
				}
				setState(135);
				qualifiedName();
				setState(138);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(136);
					match(WITH);
					setState(137);
					tableProperties();
					}
				}

				setState(140);
				match(AS);
				setState(141);
				query();
				setState(147);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(142);
					match(WITH);
					setState(144);
					_la = _input.LA(1);
					if (_la==NO) {
						{
						setState(143);
						match(NO);
						}
					}

					setState(146);
					match(DATA);
					}
				}

				}
				break;
			case 5:
				_localctx = new CreateTableContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(149);
				match(CREATE);
				setState(150);
				match(TABLE);
				setState(154);
				switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
				case 1:
					{
					setState(151);
					match(IF);
					setState(152);
					match(NOT);
					setState(153);
					match(EXISTS);
					}
					break;
				}
				setState(156);
				qualifiedName();
				setState(157);
				match(T__1);
				setState(158);
				tableElement();
				setState(163);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(159);
					match(T__2);
					setState(160);
					tableElement();
					}
					}
					setState(165);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(166);
				match(T__3);
				setState(169);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(167);
					match(WITH);
					setState(168);
					tableProperties();
					}
				}

				}
				break;
			case 6:
				_localctx = new DropTableContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(171);
				match(DROP);
				setState(172);
				match(TABLE);
				setState(175);
				switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
				case 1:
					{
					setState(173);
					match(IF);
					setState(174);
					match(EXISTS);
					}
					break;
				}
				setState(177);
				qualifiedName();
				}
				break;
			case 7:
				_localctx = new InsertIntoContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(178);
				match(INSERT);
				setState(179);
				match(INTO);
				setState(180);
				qualifiedName();
				setState(182);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(181);
					columnAliases();
					}
					break;
				}
				setState(184);
				query();
				}
				break;
			case 8:
				_localctx = new DeleteContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(186);
				match(DELETE);
				setState(187);
				match(FROM);
				setState(188);
				qualifiedName();
				setState(191);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(189);
					match(WHERE);
					setState(190);
					booleanExpression(0);
					}
				}

				}
				break;
			case 9:
				_localctx = new RenameTableContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(193);
				match(ALTER);
				setState(194);
				match(TABLE);
				setState(195);
				((RenameTableContext)_localctx).from = qualifiedName();
				setState(196);
				match(RENAME);
				setState(197);
				match(TO);
				setState(198);
				((RenameTableContext)_localctx).to = qualifiedName();
				}
				break;
			case 10:
				_localctx = new RenameColumnContext(_localctx);
				enterOuterAlt(_localctx, 10);
				{
				setState(200);
				match(ALTER);
				setState(201);
				match(TABLE);
				setState(202);
				((RenameColumnContext)_localctx).tableName = qualifiedName();
				setState(203);
				match(RENAME);
				setState(204);
				match(COLUMN);
				setState(205);
				((RenameColumnContext)_localctx).from = identifier();
				setState(206);
				match(TO);
				setState(207);
				((RenameColumnContext)_localctx).to = identifier();
				}
				break;
			case 11:
				_localctx = new AddColumnContext(_localctx);
				enterOuterAlt(_localctx, 11);
				{
				setState(209);
				match(ALTER);
				setState(210);
				match(TABLE);
				setState(211);
				((AddColumnContext)_localctx).tableName = qualifiedName();
				setState(212);
				match(ADD);
				setState(213);
				match(COLUMN);
				setState(214);
				((AddColumnContext)_localctx).column = tableElement();
				}
				break;
			case 12:
				_localctx = new CreateViewContext(_localctx);
				enterOuterAlt(_localctx, 12);
				{
				setState(216);
				match(CREATE);
				setState(219);
				_la = _input.LA(1);
				if (_la==OR) {
					{
					setState(217);
					match(OR);
					setState(218);
					match(REPLACE);
					}
				}

				setState(221);
				match(VIEW);
				setState(222);
				qualifiedName();
				setState(223);
				match(AS);
				setState(224);
				query();
				}
				break;
			case 13:
				_localctx = new DropViewContext(_localctx);
				enterOuterAlt(_localctx, 13);
				{
				setState(226);
				match(DROP);
				setState(227);
				match(VIEW);
				setState(230);
				switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
				case 1:
					{
					setState(228);
					match(IF);
					setState(229);
					match(EXISTS);
					}
					break;
				}
				setState(232);
				qualifiedName();
				}
				break;
			case 14:
				_localctx = new CallContext(_localctx);
				enterOuterAlt(_localctx, 14);
				{
				setState(233);
				match(CALL);
				setState(234);
				qualifiedName();
				setState(235);
				match(T__1);
				setState(244);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << ADD) | (1L << APPROXIMATE) | (1L << AT) | (1L << CONFIDENCE) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << SUBSTRING) | (1L << POSITION) | (1L << TINYINT) | (1L << SMALLINT) | (1L << INTEGER) | (1L << DATE) | (1L << TIME) | (1L << TIMESTAMP) | (1L << INTERVAL) | (1L << YEAR) | (1L << MONTH) | (1L << DAY) | (1L << HOUR) | (1L << MINUTE) | (1L << SECOND))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (ZONE - 64)) | (1L << (CURRENT_DATE - 64)) | (1L << (CURRENT_TIME - 64)) | (1L << (CURRENT_TIMESTAMP - 64)) | (1L << (LOCALTIME - 64)) | (1L << (LOCALTIMESTAMP - 64)) | (1L << (EXTRACT - 64)) | (1L << (CASE - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (ROW - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (GRANT - 64)) | (1L << (REVOKE - 64)) | (1L << (PRIVILEGES - 64)) | (1L << (PUBLIC - 64)) | (1L << (OPTION - 64)) | (1L << (EXPLAIN - 64)) | (1L << (ANALYZE - 64)) | (1L << (FORMAT - 64)) | (1L << (TYPE - 64)) | (1L << (TEXT - 64)) | (1L << (GRAPHVIZ - 64)) | (1L << (LOGICAL - 64)) | (1L << (DISTRIBUTED - 64)) | (1L << (TRY - 64)) | (1L << (CAST - 64)) | (1L << (TRY_CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (SCHEMAS - 64)) | (1L << (CATALOGS - 64)) | (1L << (COLUMNS - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (COLUMN - 128)) | (1L << (USE - 128)) | (1L << (PARTITIONS - 128)) | (1L << (FUNCTIONS - 128)) | (1L << (TO - 128)) | (1L << (SYSTEM - 128)) | (1L << (BERNOULLI - 128)) | (1L << (POISSONIZED - 128)) | (1L << (TABLESAMPLE - 128)) | (1L << (RESCALED - 128)) | (1L << (ARRAY - 128)) | (1L << (MAP - 128)) | (1L << (SET - 128)) | (1L << (RESET - 128)) | (1L << (SESSION - 128)) | (1L << (DATA - 128)) | (1L << (START - 128)) | (1L << (TRANSACTION - 128)) | (1L << (COMMIT - 128)) | (1L << (ROLLBACK - 128)) | (1L << (WORK - 128)) | (1L << (ISOLATION - 128)) | (1L << (LEVEL - 128)) | (1L << (SERIALIZABLE - 128)) | (1L << (REPEATABLE - 128)) | (1L << (COMMITTED - 128)) | (1L << (UNCOMMITTED - 128)) | (1L << (READ - 128)) | (1L << (WRITE - 128)) | (1L << (ONLY - 128)) | (1L << (CALL - 128)) | (1L << (NORMALIZE - 128)) | (1L << (NFD - 128)) | (1L << (NFC - 128)) | (1L << (NFKD - 128)) | (1L << (NFKC - 128)) | (1L << (IF - 128)) | (1L << (NULLIF - 128)) | (1L << (COALESCE - 128)) | (1L << (PLUS - 128)) | (1L << (MINUS - 128)) | (1L << (STRING - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (BINARY_LITERAL - 192)) | (1L << (INTEGER_VALUE - 192)) | (1L << (DECIMAL_VALUE - 192)) | (1L << (IDENTIFIER - 192)) | (1L << (DIGIT_IDENTIFIER - 192)) | (1L << (QUOTED_IDENTIFIER - 192)) | (1L << (BACKQUOTED_IDENTIFIER - 192)))) != 0)) {
					{
					setState(236);
					callArgument();
					setState(241);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(237);
						match(T__2);
						setState(238);
						callArgument();
						}
						}
						setState(243);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(246);
				match(T__3);
				}
				break;
			case 15:
				_localctx = new GrantContext(_localctx);
				enterOuterAlt(_localctx, 15);
				{
				setState(248);
				match(GRANT);
				setState(259);
				switch (_input.LA(1)) {
				case SELECT:
				case ADD:
				case APPROXIMATE:
				case AT:
				case CONFIDENCE:
				case NO:
				case SUBSTRING:
				case POSITION:
				case TINYINT:
				case SMALLINT:
				case INTEGER:
				case DATE:
				case TIME:
				case TIMESTAMP:
				case INTERVAL:
				case YEAR:
				case MONTH:
				case DAY:
				case HOUR:
				case MINUTE:
				case SECOND:
				case ZONE:
				case OVER:
				case PARTITION:
				case RANGE:
				case ROWS:
				case PRECEDING:
				case FOLLOWING:
				case CURRENT:
				case ROW:
				case VIEW:
				case REPLACE:
				case INSERT:
				case DELETE:
				case GRANT:
				case REVOKE:
				case PRIVILEGES:
				case PUBLIC:
				case OPTION:
				case EXPLAIN:
				case ANALYZE:
				case FORMAT:
				case TYPE:
				case TEXT:
				case GRAPHVIZ:
				case LOGICAL:
				case DISTRIBUTED:
				case TRY:
				case SHOW:
				case TABLES:
				case SCHEMAS:
				case CATALOGS:
				case COLUMNS:
				case COLUMN:
				case USE:
				case PARTITIONS:
				case FUNCTIONS:
				case TO:
				case SYSTEM:
				case BERNOULLI:
				case POISSONIZED:
				case TABLESAMPLE:
				case RESCALED:
				case ARRAY:
				case MAP:
				case SET:
				case RESET:
				case SESSION:
				case DATA:
				case START:
				case TRANSACTION:
				case COMMIT:
				case ROLLBACK:
				case WORK:
				case ISOLATION:
				case LEVEL:
				case SERIALIZABLE:
				case REPEATABLE:
				case COMMITTED:
				case UNCOMMITTED:
				case READ:
				case WRITE:
				case ONLY:
				case CALL:
				case NFD:
				case NFC:
				case NFKD:
				case NFKC:
				case IF:
				case NULLIF:
				case COALESCE:
				case IDENTIFIER:
				case DIGIT_IDENTIFIER:
				case QUOTED_IDENTIFIER:
				case BACKQUOTED_IDENTIFIER:
					{
					setState(249);
					privilege();
					setState(254);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(250);
						match(T__2);
						setState(251);
						privilege();
						}
						}
						setState(256);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case ALL:
					{
					setState(257);
					match(ALL);
					setState(258);
					match(PRIVILEGES);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(261);
				match(ON);
				setState(263);
				_la = _input.LA(1);
				if (_la==TABLE) {
					{
					setState(262);
					match(TABLE);
					}
				}

				setState(265);
				qualifiedName();
				setState(266);
				match(TO);
				setState(267);
				((GrantContext)_localctx).grantee = identifier();
				setState(271);
				_la = _input.LA(1);
				if (_la==WITH) {
					{
					setState(268);
					match(WITH);
					setState(269);
					match(GRANT);
					setState(270);
					match(OPTION);
					}
				}

				}
				break;
			case 16:
				_localctx = new RevokeContext(_localctx);
				enterOuterAlt(_localctx, 16);
				{
				setState(273);
				match(REVOKE);
				setState(277);
				switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
				case 1:
					{
					setState(274);
					match(GRANT);
					setState(275);
					match(OPTION);
					setState(276);
					match(FOR);
					}
					break;
				}
				setState(289);
				switch (_input.LA(1)) {
				case SELECT:
				case ADD:
				case APPROXIMATE:
				case AT:
				case CONFIDENCE:
				case NO:
				case SUBSTRING:
				case POSITION:
				case TINYINT:
				case SMALLINT:
				case INTEGER:
				case DATE:
				case TIME:
				case TIMESTAMP:
				case INTERVAL:
				case YEAR:
				case MONTH:
				case DAY:
				case HOUR:
				case MINUTE:
				case SECOND:
				case ZONE:
				case OVER:
				case PARTITION:
				case RANGE:
				case ROWS:
				case PRECEDING:
				case FOLLOWING:
				case CURRENT:
				case ROW:
				case VIEW:
				case REPLACE:
				case INSERT:
				case DELETE:
				case GRANT:
				case REVOKE:
				case PRIVILEGES:
				case PUBLIC:
				case OPTION:
				case EXPLAIN:
				case ANALYZE:
				case FORMAT:
				case TYPE:
				case TEXT:
				case GRAPHVIZ:
				case LOGICAL:
				case DISTRIBUTED:
				case TRY:
				case SHOW:
				case TABLES:
				case SCHEMAS:
				case CATALOGS:
				case COLUMNS:
				case COLUMN:
				case USE:
				case PARTITIONS:
				case FUNCTIONS:
				case TO:
				case SYSTEM:
				case BERNOULLI:
				case POISSONIZED:
				case TABLESAMPLE:
				case RESCALED:
				case ARRAY:
				case MAP:
				case SET:
				case RESET:
				case SESSION:
				case DATA:
				case START:
				case TRANSACTION:
				case COMMIT:
				case ROLLBACK:
				case WORK:
				case ISOLATION:
				case LEVEL:
				case SERIALIZABLE:
				case REPEATABLE:
				case COMMITTED:
				case UNCOMMITTED:
				case READ:
				case WRITE:
				case ONLY:
				case CALL:
				case NFD:
				case NFC:
				case NFKD:
				case NFKC:
				case IF:
				case NULLIF:
				case COALESCE:
				case IDENTIFIER:
				case DIGIT_IDENTIFIER:
				case QUOTED_IDENTIFIER:
				case BACKQUOTED_IDENTIFIER:
					{
					setState(279);
					privilege();
					setState(284);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(280);
						match(T__2);
						setState(281);
						privilege();
						}
						}
						setState(286);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				case ALL:
					{
					setState(287);
					match(ALL);
					setState(288);
					match(PRIVILEGES);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(291);
				match(ON);
				setState(293);
				_la = _input.LA(1);
				if (_la==TABLE) {
					{
					setState(292);
					match(TABLE);
					}
				}

				setState(295);
				qualifiedName();
				setState(296);
				match(FROM);
				setState(297);
				((RevokeContext)_localctx).grantee = identifier();
				}
				break;
			case 17:
				_localctx = new ExplainContext(_localctx);
				enterOuterAlt(_localctx, 17);
				{
				setState(299);
				match(EXPLAIN);
				setState(301);
				_la = _input.LA(1);
				if (_la==ANALYZE) {
					{
					setState(300);
					match(ANALYZE);
					}
				}

				setState(314);
				switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
				case 1:
					{
					setState(303);
					match(T__1);
					setState(304);
					explainOption();
					setState(309);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(305);
						match(T__2);
						setState(306);
						explainOption();
						}
						}
						setState(311);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(312);
					match(T__3);
					}
					break;
				}
				setState(316);
				statement();
				}
				break;
			case 18:
				_localctx = new ShowCreateTableContext(_localctx);
				enterOuterAlt(_localctx, 18);
				{
				setState(317);
				match(SHOW);
				setState(318);
				match(CREATE);
				setState(319);
				match(TABLE);
				setState(320);
				qualifiedName();
				}
				break;
			case 19:
				_localctx = new ShowCreateViewContext(_localctx);
				enterOuterAlt(_localctx, 19);
				{
				setState(321);
				match(SHOW);
				setState(322);
				match(CREATE);
				setState(323);
				match(VIEW);
				setState(324);
				qualifiedName();
				}
				break;
			case 20:
				_localctx = new ShowTablesContext(_localctx);
				enterOuterAlt(_localctx, 20);
				{
				setState(325);
				match(SHOW);
				setState(326);
				match(TABLES);
				setState(329);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(327);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(328);
					qualifiedName();
					}
				}

				setState(333);
				_la = _input.LA(1);
				if (_la==LIKE) {
					{
					setState(331);
					match(LIKE);
					setState(332);
					((ShowTablesContext)_localctx).pattern = match(STRING);
					}
				}

				}
				break;
			case 21:
				_localctx = new ShowSchemasContext(_localctx);
				enterOuterAlt(_localctx, 21);
				{
				setState(335);
				match(SHOW);
				setState(336);
				match(SCHEMAS);
				setState(339);
				_la = _input.LA(1);
				if (_la==FROM || _la==IN) {
					{
					setState(337);
					_la = _input.LA(1);
					if ( !(_la==FROM || _la==IN) ) {
					_errHandler.recoverInline(this);
					} else {
						consume();
					}
					setState(338);
					identifier();
					}
				}

				setState(343);
				_la = _input.LA(1);
				if (_la==LIKE) {
					{
					setState(341);
					match(LIKE);
					setState(342);
					((ShowSchemasContext)_localctx).pattern = match(STRING);
					}
				}

				}
				break;
			case 22:
				_localctx = new ShowCatalogsContext(_localctx);
				enterOuterAlt(_localctx, 22);
				{
				setState(345);
				match(SHOW);
				setState(346);
				match(CATALOGS);
				setState(349);
				_la = _input.LA(1);
				if (_la==LIKE) {
					{
					setState(347);
					match(LIKE);
					setState(348);
					((ShowCatalogsContext)_localctx).pattern = match(STRING);
					}
				}

				}
				break;
			case 23:
				_localctx = new ShowColumnsContext(_localctx);
				enterOuterAlt(_localctx, 23);
				{
				setState(351);
				match(SHOW);
				setState(352);
				match(COLUMNS);
				setState(353);
				_la = _input.LA(1);
				if ( !(_la==FROM || _la==IN) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(354);
				qualifiedName();
				}
				break;
			case 24:
				_localctx = new ShowColumnsContext(_localctx);
				enterOuterAlt(_localctx, 24);
				{
				setState(355);
				match(DESCRIBE);
				setState(356);
				qualifiedName();
				}
				break;
			case 25:
				_localctx = new ShowColumnsContext(_localctx);
				enterOuterAlt(_localctx, 25);
				{
				setState(357);
				match(DESC);
				setState(358);
				qualifiedName();
				}
				break;
			case 26:
				_localctx = new ShowFunctionsContext(_localctx);
				enterOuterAlt(_localctx, 26);
				{
				setState(359);
				match(SHOW);
				setState(360);
				match(FUNCTIONS);
				}
				break;
			case 27:
				_localctx = new ShowSessionContext(_localctx);
				enterOuterAlt(_localctx, 27);
				{
				setState(361);
				match(SHOW);
				setState(362);
				match(SESSION);
				}
				break;
			case 28:
				_localctx = new SetSessionContext(_localctx);
				enterOuterAlt(_localctx, 28);
				{
				setState(363);
				match(SET);
				setState(364);
				match(SESSION);
				setState(365);
				qualifiedName();
				setState(366);
				match(EQ);
				setState(367);
				expression();
				}
				break;
			case 29:
				_localctx = new ResetSessionContext(_localctx);
				enterOuterAlt(_localctx, 29);
				{
				setState(369);
				match(RESET);
				setState(370);
				match(SESSION);
				setState(371);
				qualifiedName();
				}
				break;
			case 30:
				_localctx = new StartTransactionContext(_localctx);
				enterOuterAlt(_localctx, 30);
				{
				setState(372);
				match(START);
				setState(373);
				match(TRANSACTION);
				setState(382);
				_la = _input.LA(1);
				if (_la==ISOLATION || _la==READ) {
					{
					setState(374);
					transactionMode();
					setState(379);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(375);
						match(T__2);
						setState(376);
						transactionMode();
						}
						}
						setState(381);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				}
				break;
			case 31:
				_localctx = new CommitContext(_localctx);
				enterOuterAlt(_localctx, 31);
				{
				setState(384);
				match(COMMIT);
				setState(386);
				_la = _input.LA(1);
				if (_la==WORK) {
					{
					setState(385);
					match(WORK);
					}
				}

				}
				break;
			case 32:
				_localctx = new RollbackContext(_localctx);
				enterOuterAlt(_localctx, 32);
				{
				setState(388);
				match(ROLLBACK);
				setState(390);
				_la = _input.LA(1);
				if (_la==WORK) {
					{
					setState(389);
					match(WORK);
					}
				}

				}
				break;
			case 33:
				_localctx = new ShowPartitionsContext(_localctx);
				enterOuterAlt(_localctx, 33);
				{
				setState(392);
				match(SHOW);
				setState(393);
				match(PARTITIONS);
				setState(394);
				_la = _input.LA(1);
				if ( !(_la==FROM || _la==IN) ) {
				_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(395);
				qualifiedName();
				setState(398);
				_la = _input.LA(1);
				if (_la==WHERE) {
					{
					setState(396);
					match(WHERE);
					setState(397);
					booleanExpression(0);
					}
				}

				setState(410);
				_la = _input.LA(1);
				if (_la==ORDER) {
					{
					setState(400);
					match(ORDER);
					setState(401);
					match(BY);
					setState(402);
					sortItem();
					setState(407);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(403);
						match(T__2);
						setState(404);
						sortItem();
						}
						}
						setState(409);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(414);
				_la = _input.LA(1);
				if (_la==LIMIT) {
					{
					setState(412);
					match(LIMIT);
					setState(413);
					((ShowPartitionsContext)_localctx).limit = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==ALL || _la==INTEGER_VALUE) ) {
						((ShowPartitionsContext)_localctx).limit = (Token)_errHandler.recoverInline(this);
					} else {
						consume();
					}
					}
				}

				}
				break;
			case 34:
				_localctx = new PrepareContext(_localctx);
				enterOuterAlt(_localctx, 34);
				{
				setState(416);
				match(PREPARE);
				setState(417);
				identifier();
				setState(418);
				match(FROM);
				setState(419);
				statement();
				}
				break;
			case 35:
				_localctx = new DeallocateContext(_localctx);
				enterOuterAlt(_localctx, 35);
				{
				setState(421);
				match(DEALLOCATE);
				setState(422);
				match(PREPARE);
				setState(423);
				identifier();
				}
				break;
			case 36:
				_localctx = new ExecuteContext(_localctx);
				enterOuterAlt(_localctx, 36);
				{
				setState(424);
				match(EXECUTE);
				setState(425);
				identifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryContext extends ParserRuleContext {
		public QueryNoWithContext queryNoWith() {
			return getRuleContext(QueryNoWithContext.class,0);
		}
		public WithContext with() {
			return getRuleContext(WithContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			_la = _input.LA(1);
			if (_la==WITH) {
				{
				setState(428);
				with();
				}
			}

			setState(431);
			queryNoWith();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WithContext extends ParserRuleContext {
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public List<NamedQueryContext> namedQuery() {
			return getRuleContexts(NamedQueryContext.class);
		}
		public NamedQueryContext namedQuery(int i) {
			return getRuleContext(NamedQueryContext.class,i);
		}
		public TerminalNode RECURSIVE() { return getToken(SqlBaseParser.RECURSIVE, 0); }
		public WithContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_with; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterWith(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitWith(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitWith(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WithContext with() throws RecognitionException {
		WithContext _localctx = new WithContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_with);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			match(WITH);
			setState(435);
			_la = _input.LA(1);
			if (_la==RECURSIVE) {
				{
				setState(434);
				match(RECURSIVE);
				}
			}

			setState(437);
			namedQuery();
			setState(442);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(438);
				match(T__2);
				setState(439);
				namedQuery();
				}
				}
				setState(444);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TableElementContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TableElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTableElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTableElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTableElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableElementContext tableElement() throws RecognitionException {
		TableElementContext _localctx = new TableElementContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_tableElement);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(445);
			identifier();
			setState(446);
			type(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TablePropertiesContext extends ParserRuleContext {
		public List<TablePropertyContext> tableProperty() {
			return getRuleContexts(TablePropertyContext.class);
		}
		public TablePropertyContext tableProperty(int i) {
			return getRuleContext(TablePropertyContext.class,i);
		}
		public TablePropertiesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableProperties; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTableProperties(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTableProperties(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTableProperties(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablePropertiesContext tableProperties() throws RecognitionException {
		TablePropertiesContext _localctx = new TablePropertiesContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_tableProperties);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(448);
			match(T__1);
			setState(449);
			tableProperty();
			setState(454);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(450);
				match(T__2);
				setState(451);
				tableProperty();
				}
				}
				setState(456);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(457);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TablePropertyContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode EQ() { return getToken(SqlBaseParser.EQ, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TablePropertyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableProperty; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTableProperty(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTableProperty(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTableProperty(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TablePropertyContext tableProperty() throws RecognitionException {
		TablePropertyContext _localctx = new TablePropertyContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_tableProperty);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(459);
			identifier();
			setState(460);
			match(EQ);
			setState(461);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryNoWithContext extends ParserRuleContext {
		public Token limit;
		public NumberContext confidence;
		public QueryTermContext queryTerm() {
			return getRuleContext(QueryTermContext.class,0);
		}
		public TerminalNode ORDER() { return getToken(SqlBaseParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public List<SortItemContext> sortItem() {
			return getRuleContexts(SortItemContext.class);
		}
		public SortItemContext sortItem(int i) {
			return getRuleContext(SortItemContext.class,i);
		}
		public TerminalNode LIMIT() { return getToken(SqlBaseParser.LIMIT, 0); }
		public TerminalNode APPROXIMATE() { return getToken(SqlBaseParser.APPROXIMATE, 0); }
		public TerminalNode AT() { return getToken(SqlBaseParser.AT, 0); }
		public TerminalNode CONFIDENCE() { return getToken(SqlBaseParser.CONFIDENCE, 0); }
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public QueryNoWithContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryNoWith; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQueryNoWith(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQueryNoWith(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQueryNoWith(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryNoWithContext queryNoWith() throws RecognitionException {
		QueryNoWithContext _localctx = new QueryNoWithContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_queryNoWith);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(463);
			queryTerm(0);
			setState(474);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(464);
				match(ORDER);
				setState(465);
				match(BY);
				setState(466);
				sortItem();
				setState(471);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(467);
					match(T__2);
					setState(468);
					sortItem();
					}
					}
					setState(473);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(478);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(476);
				match(LIMIT);
				setState(477);
				((QueryNoWithContext)_localctx).limit = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ALL || _la==INTEGER_VALUE) ) {
					((QueryNoWithContext)_localctx).limit = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(485);
			_la = _input.LA(1);
			if (_la==APPROXIMATE) {
				{
				setState(480);
				match(APPROXIMATE);
				setState(481);
				match(AT);
				setState(482);
				((QueryNoWithContext)_localctx).confidence = number();
				setState(483);
				match(CONFIDENCE);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryTermContext extends ParserRuleContext {
		public QueryTermContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryTerm; }
	 
		public QueryTermContext() { }
		public void copyFrom(QueryTermContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class QueryTermDefaultContext extends QueryTermContext {
		public QueryPrimaryContext queryPrimary() {
			return getRuleContext(QueryPrimaryContext.class,0);
		}
		public QueryTermDefaultContext(QueryTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQueryTermDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQueryTermDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQueryTermDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SetOperationContext extends QueryTermContext {
		public QueryTermContext left;
		public Token operator;
		public QueryTermContext right;
		public List<QueryTermContext> queryTerm() {
			return getRuleContexts(QueryTermContext.class);
		}
		public QueryTermContext queryTerm(int i) {
			return getRuleContext(QueryTermContext.class,i);
		}
		public TerminalNode INTERSECT() { return getToken(SqlBaseParser.INTERSECT, 0); }
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public TerminalNode UNION() { return getToken(SqlBaseParser.UNION, 0); }
		public TerminalNode EXCEPT() { return getToken(SqlBaseParser.EXCEPT, 0); }
		public SetOperationContext(QueryTermContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetOperation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetOperation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetOperation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryTermContext queryTerm() throws RecognitionException {
		return queryTerm(0);
	}

	private QueryTermContext queryTerm(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		QueryTermContext _localctx = new QueryTermContext(_ctx, _parentState);
		QueryTermContext _prevctx = _localctx;
		int _startState = 18;
		enterRecursionRule(_localctx, 18, RULE_queryTerm, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new QueryTermDefaultContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(488);
			queryPrimary();
			}
			_ctx.stop = _input.LT(-1);
			setState(504);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(502);
					switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
					case 1:
						{
						_localctx = new SetOperationContext(new QueryTermContext(_parentctx, _parentState));
						((SetOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_queryTerm);
						setState(490);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(491);
						((SetOperationContext)_localctx).operator = match(INTERSECT);
						setState(493);
						_la = _input.LA(1);
						if (_la==ALL || _la==DISTINCT) {
							{
							setState(492);
							setQuantifier();
							}
						}

						setState(495);
						((SetOperationContext)_localctx).right = queryTerm(3);
						}
						break;
					case 2:
						{
						_localctx = new SetOperationContext(new QueryTermContext(_parentctx, _parentState));
						((SetOperationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_queryTerm);
						setState(496);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(497);
						((SetOperationContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==UNION || _la==EXCEPT) ) {
							((SetOperationContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(499);
						_la = _input.LA(1);
						if (_la==ALL || _la==DISTINCT) {
							{
							setState(498);
							setQuantifier();
							}
						}

						setState(501);
						((SetOperationContext)_localctx).right = queryTerm(2);
						}
						break;
					}
					} 
				}
				setState(506);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,50,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class QueryPrimaryContext extends ParserRuleContext {
		public QueryPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queryPrimary; }
	 
		public QueryPrimaryContext() { }
		public void copyFrom(QueryPrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SubqueryContext extends QueryPrimaryContext {
		public QueryNoWithContext queryNoWith() {
			return getRuleContext(QueryNoWithContext.class,0);
		}
		public SubqueryContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSubquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSubquery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSubquery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class QueryPrimaryDefaultContext extends QueryPrimaryContext {
		public QuerySpecificationContext querySpecification() {
			return getRuleContext(QuerySpecificationContext.class,0);
		}
		public QueryPrimaryDefaultContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQueryPrimaryDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQueryPrimaryDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQueryPrimaryDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TableContext extends QueryPrimaryContext {
		public TerminalNode TABLE() { return getToken(SqlBaseParser.TABLE, 0); }
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TableContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InlineTableContext extends QueryPrimaryContext {
		public TerminalNode VALUES() { return getToken(SqlBaseParser.VALUES, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public InlineTableContext(QueryPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInlineTable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInlineTable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInlineTable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryPrimaryContext queryPrimary() throws RecognitionException {
		QueryPrimaryContext _localctx = new QueryPrimaryContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_queryPrimary);
		try {
			int _alt;
			setState(523);
			switch (_input.LA(1)) {
			case SELECT:
				_localctx = new QueryPrimaryDefaultContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(507);
				querySpecification();
				}
				break;
			case TABLE:
				_localctx = new TableContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(508);
				match(TABLE);
				setState(509);
				qualifiedName();
				}
				break;
			case VALUES:
				_localctx = new InlineTableContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(510);
				match(VALUES);
				setState(511);
				expression();
				setState(516);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(512);
						match(T__2);
						setState(513);
						expression();
						}
						} 
					}
					setState(518);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,51,_ctx);
				}
				}
				break;
			case T__1:
				_localctx = new SubqueryContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(519);
				match(T__1);
				setState(520);
				queryNoWith();
				setState(521);
				match(T__3);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SortItemContext extends ParserRuleContext {
		public Token ordering;
		public Token nullOrdering;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode NULLS() { return getToken(SqlBaseParser.NULLS, 0); }
		public TerminalNode ASC() { return getToken(SqlBaseParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(SqlBaseParser.DESC, 0); }
		public TerminalNode FIRST() { return getToken(SqlBaseParser.FIRST, 0); }
		public TerminalNode LAST() { return getToken(SqlBaseParser.LAST, 0); }
		public SortItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sortItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSortItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSortItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSortItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SortItemContext sortItem() throws RecognitionException {
		SortItemContext _localctx = new SortItemContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_sortItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(525);
			expression();
			setState(527);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(526);
				((SortItemContext)_localctx).ordering = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==ASC || _la==DESC) ) {
					((SortItemContext)_localctx).ordering = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(531);
			_la = _input.LA(1);
			if (_la==NULLS) {
				{
				setState(529);
				match(NULLS);
				setState(530);
				((SortItemContext)_localctx).nullOrdering = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==FIRST || _la==LAST) ) {
					((SortItemContext)_localctx).nullOrdering = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuerySpecificationContext extends ParserRuleContext {
		public BooleanExpressionContext where;
		public BooleanExpressionContext having;
		public TerminalNode SELECT() { return getToken(SqlBaseParser.SELECT, 0); }
		public List<SelectItemContext> selectItem() {
			return getRuleContexts(SelectItemContext.class);
		}
		public SelectItemContext selectItem(int i) {
			return getRuleContext(SelectItemContext.class,i);
		}
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public List<RelationContext> relation() {
			return getRuleContexts(RelationContext.class);
		}
		public RelationContext relation(int i) {
			return getRuleContext(RelationContext.class,i);
		}
		public TerminalNode WHERE() { return getToken(SqlBaseParser.WHERE, 0); }
		public TerminalNode GROUP() { return getToken(SqlBaseParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(SqlBaseParser.BY, 0); }
		public GroupByContext groupBy() {
			return getRuleContext(GroupByContext.class,0);
		}
		public TerminalNode HAVING() { return getToken(SqlBaseParser.HAVING, 0); }
		public List<BooleanExpressionContext> booleanExpression() {
			return getRuleContexts(BooleanExpressionContext.class);
		}
		public BooleanExpressionContext booleanExpression(int i) {
			return getRuleContext(BooleanExpressionContext.class,i);
		}
		public QuerySpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_querySpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQuerySpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQuerySpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQuerySpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuerySpecificationContext querySpecification() throws RecognitionException {
		QuerySpecificationContext _localctx = new QuerySpecificationContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_querySpecification);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(533);
			match(SELECT);
			setState(535);
			_la = _input.LA(1);
			if (_la==ALL || _la==DISTINCT) {
				{
				setState(534);
				setQuantifier();
				}
			}

			setState(537);
			selectItem();
			setState(542);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(538);
					match(T__2);
					setState(539);
					selectItem();
					}
					} 
				}
				setState(544);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,56,_ctx);
			}
			setState(554);
			switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
			case 1:
				{
				setState(545);
				match(FROM);
				setState(546);
				relation(0);
				setState(551);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(547);
						match(T__2);
						setState(548);
						relation(0);
						}
						} 
					}
					setState(553);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,57,_ctx);
				}
				}
				break;
			}
			setState(558);
			switch ( getInterpreter().adaptivePredict(_input,59,_ctx) ) {
			case 1:
				{
				setState(556);
				match(WHERE);
				setState(557);
				((QuerySpecificationContext)_localctx).where = booleanExpression(0);
				}
				break;
			}
			setState(563);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				{
				setState(560);
				match(GROUP);
				setState(561);
				match(BY);
				setState(562);
				groupBy();
				}
				break;
			}
			setState(567);
			switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
			case 1:
				{
				setState(565);
				match(HAVING);
				setState(566);
				((QuerySpecificationContext)_localctx).having = booleanExpression(0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GroupByContext extends ParserRuleContext {
		public List<GroupingElementContext> groupingElement() {
			return getRuleContexts(GroupingElementContext.class);
		}
		public GroupingElementContext groupingElement(int i) {
			return getRuleContext(GroupingElementContext.class,i);
		}
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public GroupByContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupBy; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterGroupBy(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitGroupBy(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitGroupBy(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupByContext groupBy() throws RecognitionException {
		GroupByContext _localctx = new GroupByContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_groupBy);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(570);
			_la = _input.LA(1);
			if (_la==ALL || _la==DISTINCT) {
				{
				setState(569);
				setQuantifier();
				}
			}

			setState(572);
			groupingElement();
			setState(577);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(573);
					match(T__2);
					setState(574);
					groupingElement();
					}
					} 
				}
				setState(579);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,63,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GroupingElementContext extends ParserRuleContext {
		public GroupingElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupingElement; }
	 
		public GroupingElementContext() { }
		public void copyFrom(GroupingElementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MultipleGroupingSetsContext extends GroupingElementContext {
		public TerminalNode GROUPING() { return getToken(SqlBaseParser.GROUPING, 0); }
		public TerminalNode SETS() { return getToken(SqlBaseParser.SETS, 0); }
		public List<GroupingSetContext> groupingSet() {
			return getRuleContexts(GroupingSetContext.class);
		}
		public GroupingSetContext groupingSet(int i) {
			return getRuleContext(GroupingSetContext.class,i);
		}
		public MultipleGroupingSetsContext(GroupingElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterMultipleGroupingSets(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitMultipleGroupingSets(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitMultipleGroupingSets(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SingleGroupingSetContext extends GroupingElementContext {
		public GroupingExpressionsContext groupingExpressions() {
			return getRuleContext(GroupingExpressionsContext.class,0);
		}
		public SingleGroupingSetContext(GroupingElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSingleGroupingSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSingleGroupingSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSingleGroupingSet(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CubeContext extends GroupingElementContext {
		public TerminalNode CUBE() { return getToken(SqlBaseParser.CUBE, 0); }
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public CubeContext(GroupingElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCube(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCube(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCube(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RollupContext extends GroupingElementContext {
		public TerminalNode ROLLUP() { return getToken(SqlBaseParser.ROLLUP, 0); }
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public RollupContext(GroupingElementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRollup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRollup(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRollup(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupingElementContext groupingElement() throws RecognitionException {
		GroupingElementContext _localctx = new GroupingElementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_groupingElement);
		int _la;
		try {
			setState(620);
			switch (_input.LA(1)) {
			case T__1:
			case ADD:
			case APPROXIMATE:
			case AT:
			case CONFIDENCE:
			case NOT:
			case NO:
			case EXISTS:
			case NULL:
			case TRUE:
			case FALSE:
			case SUBSTRING:
			case POSITION:
			case TINYINT:
			case SMALLINT:
			case INTEGER:
			case DATE:
			case TIME:
			case TIMESTAMP:
			case INTERVAL:
			case YEAR:
			case MONTH:
			case DAY:
			case HOUR:
			case MINUTE:
			case SECOND:
			case ZONE:
			case CURRENT_DATE:
			case CURRENT_TIME:
			case CURRENT_TIMESTAMP:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case EXTRACT:
			case CASE:
			case OVER:
			case PARTITION:
			case RANGE:
			case ROWS:
			case PRECEDING:
			case FOLLOWING:
			case CURRENT:
			case ROW:
			case VIEW:
			case REPLACE:
			case GRANT:
			case REVOKE:
			case PRIVILEGES:
			case PUBLIC:
			case OPTION:
			case EXPLAIN:
			case ANALYZE:
			case FORMAT:
			case TYPE:
			case TEXT:
			case GRAPHVIZ:
			case LOGICAL:
			case DISTRIBUTED:
			case TRY:
			case CAST:
			case TRY_CAST:
			case SHOW:
			case TABLES:
			case SCHEMAS:
			case CATALOGS:
			case COLUMNS:
			case COLUMN:
			case USE:
			case PARTITIONS:
			case FUNCTIONS:
			case TO:
			case SYSTEM:
			case BERNOULLI:
			case POISSONIZED:
			case TABLESAMPLE:
			case RESCALED:
			case ARRAY:
			case MAP:
			case SET:
			case RESET:
			case SESSION:
			case DATA:
			case START:
			case TRANSACTION:
			case COMMIT:
			case ROLLBACK:
			case WORK:
			case ISOLATION:
			case LEVEL:
			case SERIALIZABLE:
			case REPEATABLE:
			case COMMITTED:
			case UNCOMMITTED:
			case READ:
			case WRITE:
			case ONLY:
			case CALL:
			case NORMALIZE:
			case NFD:
			case NFC:
			case NFKD:
			case NFKC:
			case IF:
			case NULLIF:
			case COALESCE:
			case PLUS:
			case MINUS:
			case STRING:
			case BINARY_LITERAL:
			case INTEGER_VALUE:
			case DECIMAL_VALUE:
			case IDENTIFIER:
			case DIGIT_IDENTIFIER:
			case QUOTED_IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				_localctx = new SingleGroupingSetContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(580);
				groupingExpressions();
				}
				break;
			case ROLLUP:
				_localctx = new RollupContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(581);
				match(ROLLUP);
				setState(582);
				match(T__1);
				setState(591);
				_la = _input.LA(1);
				if (((((_la - 11)) & ~0x3f) == 0 && ((1L << (_la - 11)) & ((1L << (ADD - 11)) | (1L << (APPROXIMATE - 11)) | (1L << (AT - 11)) | (1L << (CONFIDENCE - 11)) | (1L << (NO - 11)) | (1L << (SUBSTRING - 11)) | (1L << (POSITION - 11)) | (1L << (TINYINT - 11)) | (1L << (SMALLINT - 11)) | (1L << (INTEGER - 11)) | (1L << (DATE - 11)) | (1L << (TIME - 11)) | (1L << (TIMESTAMP - 11)) | (1L << (INTERVAL - 11)) | (1L << (YEAR - 11)) | (1L << (MONTH - 11)) | (1L << (DAY - 11)) | (1L << (HOUR - 11)) | (1L << (MINUTE - 11)) | (1L << (SECOND - 11)) | (1L << (ZONE - 11)))) != 0) || ((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (OVER - 86)) | (1L << (PARTITION - 86)) | (1L << (RANGE - 86)) | (1L << (ROWS - 86)) | (1L << (PRECEDING - 86)) | (1L << (FOLLOWING - 86)) | (1L << (CURRENT - 86)) | (1L << (ROW - 86)) | (1L << (VIEW - 86)) | (1L << (REPLACE - 86)) | (1L << (GRANT - 86)) | (1L << (REVOKE - 86)) | (1L << (PRIVILEGES - 86)) | (1L << (PUBLIC - 86)) | (1L << (OPTION - 86)) | (1L << (EXPLAIN - 86)) | (1L << (ANALYZE - 86)) | (1L << (FORMAT - 86)) | (1L << (TYPE - 86)) | (1L << (TEXT - 86)) | (1L << (GRAPHVIZ - 86)) | (1L << (LOGICAL - 86)) | (1L << (DISTRIBUTED - 86)) | (1L << (TRY - 86)) | (1L << (SHOW - 86)) | (1L << (TABLES - 86)) | (1L << (SCHEMAS - 86)) | (1L << (CATALOGS - 86)) | (1L << (COLUMNS - 86)) | (1L << (COLUMN - 86)) | (1L << (USE - 86)) | (1L << (PARTITIONS - 86)) | (1L << (FUNCTIONS - 86)) | (1L << (TO - 86)) | (1L << (SYSTEM - 86)) | (1L << (BERNOULLI - 86)) | (1L << (POISSONIZED - 86)) | (1L << (TABLESAMPLE - 86)) | (1L << (RESCALED - 86)) | (1L << (ARRAY - 86)) | (1L << (MAP - 86)) | (1L << (SET - 86)))) != 0) || ((((_la - 150)) & ~0x3f) == 0 && ((1L << (_la - 150)) & ((1L << (RESET - 150)) | (1L << (SESSION - 150)) | (1L << (DATA - 150)) | (1L << (START - 150)) | (1L << (TRANSACTION - 150)) | (1L << (COMMIT - 150)) | (1L << (ROLLBACK - 150)) | (1L << (WORK - 150)) | (1L << (ISOLATION - 150)) | (1L << (LEVEL - 150)) | (1L << (SERIALIZABLE - 150)) | (1L << (REPEATABLE - 150)) | (1L << (COMMITTED - 150)) | (1L << (UNCOMMITTED - 150)) | (1L << (READ - 150)) | (1L << (WRITE - 150)) | (1L << (ONLY - 150)) | (1L << (CALL - 150)) | (1L << (NFD - 150)) | (1L << (NFC - 150)) | (1L << (NFKD - 150)) | (1L << (NFKC - 150)) | (1L << (IF - 150)) | (1L << (NULLIF - 150)) | (1L << (COALESCE - 150)) | (1L << (IDENTIFIER - 150)) | (1L << (DIGIT_IDENTIFIER - 150)) | (1L << (QUOTED_IDENTIFIER - 150)) | (1L << (BACKQUOTED_IDENTIFIER - 150)))) != 0)) {
					{
					setState(583);
					qualifiedName();
					setState(588);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(584);
						match(T__2);
						setState(585);
						qualifiedName();
						}
						}
						setState(590);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(593);
				match(T__3);
				}
				break;
			case CUBE:
				_localctx = new CubeContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(594);
				match(CUBE);
				setState(595);
				match(T__1);
				setState(604);
				_la = _input.LA(1);
				if (((((_la - 11)) & ~0x3f) == 0 && ((1L << (_la - 11)) & ((1L << (ADD - 11)) | (1L << (APPROXIMATE - 11)) | (1L << (AT - 11)) | (1L << (CONFIDENCE - 11)) | (1L << (NO - 11)) | (1L << (SUBSTRING - 11)) | (1L << (POSITION - 11)) | (1L << (TINYINT - 11)) | (1L << (SMALLINT - 11)) | (1L << (INTEGER - 11)) | (1L << (DATE - 11)) | (1L << (TIME - 11)) | (1L << (TIMESTAMP - 11)) | (1L << (INTERVAL - 11)) | (1L << (YEAR - 11)) | (1L << (MONTH - 11)) | (1L << (DAY - 11)) | (1L << (HOUR - 11)) | (1L << (MINUTE - 11)) | (1L << (SECOND - 11)) | (1L << (ZONE - 11)))) != 0) || ((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (OVER - 86)) | (1L << (PARTITION - 86)) | (1L << (RANGE - 86)) | (1L << (ROWS - 86)) | (1L << (PRECEDING - 86)) | (1L << (FOLLOWING - 86)) | (1L << (CURRENT - 86)) | (1L << (ROW - 86)) | (1L << (VIEW - 86)) | (1L << (REPLACE - 86)) | (1L << (GRANT - 86)) | (1L << (REVOKE - 86)) | (1L << (PRIVILEGES - 86)) | (1L << (PUBLIC - 86)) | (1L << (OPTION - 86)) | (1L << (EXPLAIN - 86)) | (1L << (ANALYZE - 86)) | (1L << (FORMAT - 86)) | (1L << (TYPE - 86)) | (1L << (TEXT - 86)) | (1L << (GRAPHVIZ - 86)) | (1L << (LOGICAL - 86)) | (1L << (DISTRIBUTED - 86)) | (1L << (TRY - 86)) | (1L << (SHOW - 86)) | (1L << (TABLES - 86)) | (1L << (SCHEMAS - 86)) | (1L << (CATALOGS - 86)) | (1L << (COLUMNS - 86)) | (1L << (COLUMN - 86)) | (1L << (USE - 86)) | (1L << (PARTITIONS - 86)) | (1L << (FUNCTIONS - 86)) | (1L << (TO - 86)) | (1L << (SYSTEM - 86)) | (1L << (BERNOULLI - 86)) | (1L << (POISSONIZED - 86)) | (1L << (TABLESAMPLE - 86)) | (1L << (RESCALED - 86)) | (1L << (ARRAY - 86)) | (1L << (MAP - 86)) | (1L << (SET - 86)))) != 0) || ((((_la - 150)) & ~0x3f) == 0 && ((1L << (_la - 150)) & ((1L << (RESET - 150)) | (1L << (SESSION - 150)) | (1L << (DATA - 150)) | (1L << (START - 150)) | (1L << (TRANSACTION - 150)) | (1L << (COMMIT - 150)) | (1L << (ROLLBACK - 150)) | (1L << (WORK - 150)) | (1L << (ISOLATION - 150)) | (1L << (LEVEL - 150)) | (1L << (SERIALIZABLE - 150)) | (1L << (REPEATABLE - 150)) | (1L << (COMMITTED - 150)) | (1L << (UNCOMMITTED - 150)) | (1L << (READ - 150)) | (1L << (WRITE - 150)) | (1L << (ONLY - 150)) | (1L << (CALL - 150)) | (1L << (NFD - 150)) | (1L << (NFC - 150)) | (1L << (NFKD - 150)) | (1L << (NFKC - 150)) | (1L << (IF - 150)) | (1L << (NULLIF - 150)) | (1L << (COALESCE - 150)) | (1L << (IDENTIFIER - 150)) | (1L << (DIGIT_IDENTIFIER - 150)) | (1L << (QUOTED_IDENTIFIER - 150)) | (1L << (BACKQUOTED_IDENTIFIER - 150)))) != 0)) {
					{
					setState(596);
					qualifiedName();
					setState(601);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(597);
						match(T__2);
						setState(598);
						qualifiedName();
						}
						}
						setState(603);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(606);
				match(T__3);
				}
				break;
			case GROUPING:
				_localctx = new MultipleGroupingSetsContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(607);
				match(GROUPING);
				setState(608);
				match(SETS);
				setState(609);
				match(T__1);
				setState(610);
				groupingSet();
				setState(615);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(611);
					match(T__2);
					setState(612);
					groupingSet();
					}
					}
					setState(617);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(618);
				match(T__3);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GroupingExpressionsContext extends ParserRuleContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public GroupingExpressionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupingExpressions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterGroupingExpressions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitGroupingExpressions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitGroupingExpressions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupingExpressionsContext groupingExpressions() throws RecognitionException {
		GroupingExpressionsContext _localctx = new GroupingExpressionsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_groupingExpressions);
		int _la;
		try {
			setState(635);
			switch ( getInterpreter().adaptivePredict(_input,72,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(622);
				match(T__1);
				setState(631);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << ADD) | (1L << APPROXIMATE) | (1L << AT) | (1L << CONFIDENCE) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << SUBSTRING) | (1L << POSITION) | (1L << TINYINT) | (1L << SMALLINT) | (1L << INTEGER) | (1L << DATE) | (1L << TIME) | (1L << TIMESTAMP) | (1L << INTERVAL) | (1L << YEAR) | (1L << MONTH) | (1L << DAY) | (1L << HOUR) | (1L << MINUTE) | (1L << SECOND))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (ZONE - 64)) | (1L << (CURRENT_DATE - 64)) | (1L << (CURRENT_TIME - 64)) | (1L << (CURRENT_TIMESTAMP - 64)) | (1L << (LOCALTIME - 64)) | (1L << (LOCALTIMESTAMP - 64)) | (1L << (EXTRACT - 64)) | (1L << (CASE - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (ROW - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (GRANT - 64)) | (1L << (REVOKE - 64)) | (1L << (PRIVILEGES - 64)) | (1L << (PUBLIC - 64)) | (1L << (OPTION - 64)) | (1L << (EXPLAIN - 64)) | (1L << (ANALYZE - 64)) | (1L << (FORMAT - 64)) | (1L << (TYPE - 64)) | (1L << (TEXT - 64)) | (1L << (GRAPHVIZ - 64)) | (1L << (LOGICAL - 64)) | (1L << (DISTRIBUTED - 64)) | (1L << (TRY - 64)) | (1L << (CAST - 64)) | (1L << (TRY_CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (SCHEMAS - 64)) | (1L << (CATALOGS - 64)) | (1L << (COLUMNS - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (COLUMN - 128)) | (1L << (USE - 128)) | (1L << (PARTITIONS - 128)) | (1L << (FUNCTIONS - 128)) | (1L << (TO - 128)) | (1L << (SYSTEM - 128)) | (1L << (BERNOULLI - 128)) | (1L << (POISSONIZED - 128)) | (1L << (TABLESAMPLE - 128)) | (1L << (RESCALED - 128)) | (1L << (ARRAY - 128)) | (1L << (MAP - 128)) | (1L << (SET - 128)) | (1L << (RESET - 128)) | (1L << (SESSION - 128)) | (1L << (DATA - 128)) | (1L << (START - 128)) | (1L << (TRANSACTION - 128)) | (1L << (COMMIT - 128)) | (1L << (ROLLBACK - 128)) | (1L << (WORK - 128)) | (1L << (ISOLATION - 128)) | (1L << (LEVEL - 128)) | (1L << (SERIALIZABLE - 128)) | (1L << (REPEATABLE - 128)) | (1L << (COMMITTED - 128)) | (1L << (UNCOMMITTED - 128)) | (1L << (READ - 128)) | (1L << (WRITE - 128)) | (1L << (ONLY - 128)) | (1L << (CALL - 128)) | (1L << (NORMALIZE - 128)) | (1L << (NFD - 128)) | (1L << (NFC - 128)) | (1L << (NFKD - 128)) | (1L << (NFKC - 128)) | (1L << (IF - 128)) | (1L << (NULLIF - 128)) | (1L << (COALESCE - 128)) | (1L << (PLUS - 128)) | (1L << (MINUS - 128)) | (1L << (STRING - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (BINARY_LITERAL - 192)) | (1L << (INTEGER_VALUE - 192)) | (1L << (DECIMAL_VALUE - 192)) | (1L << (IDENTIFIER - 192)) | (1L << (DIGIT_IDENTIFIER - 192)) | (1L << (QUOTED_IDENTIFIER - 192)) | (1L << (BACKQUOTED_IDENTIFIER - 192)))) != 0)) {
					{
					setState(623);
					expression();
					setState(628);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(624);
						match(T__2);
						setState(625);
						expression();
						}
						}
						setState(630);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(633);
				match(T__3);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(634);
				expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class GroupingSetContext extends ParserRuleContext {
		public List<QualifiedNameContext> qualifiedName() {
			return getRuleContexts(QualifiedNameContext.class);
		}
		public QualifiedNameContext qualifiedName(int i) {
			return getRuleContext(QualifiedNameContext.class,i);
		}
		public GroupingSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupingSet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterGroupingSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitGroupingSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitGroupingSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupingSetContext groupingSet() throws RecognitionException {
		GroupingSetContext _localctx = new GroupingSetContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_groupingSet);
		int _la;
		try {
			setState(650);
			switch (_input.LA(1)) {
			case T__1:
				enterOuterAlt(_localctx, 1);
				{
				setState(637);
				match(T__1);
				setState(646);
				_la = _input.LA(1);
				if (((((_la - 11)) & ~0x3f) == 0 && ((1L << (_la - 11)) & ((1L << (ADD - 11)) | (1L << (APPROXIMATE - 11)) | (1L << (AT - 11)) | (1L << (CONFIDENCE - 11)) | (1L << (NO - 11)) | (1L << (SUBSTRING - 11)) | (1L << (POSITION - 11)) | (1L << (TINYINT - 11)) | (1L << (SMALLINT - 11)) | (1L << (INTEGER - 11)) | (1L << (DATE - 11)) | (1L << (TIME - 11)) | (1L << (TIMESTAMP - 11)) | (1L << (INTERVAL - 11)) | (1L << (YEAR - 11)) | (1L << (MONTH - 11)) | (1L << (DAY - 11)) | (1L << (HOUR - 11)) | (1L << (MINUTE - 11)) | (1L << (SECOND - 11)) | (1L << (ZONE - 11)))) != 0) || ((((_la - 86)) & ~0x3f) == 0 && ((1L << (_la - 86)) & ((1L << (OVER - 86)) | (1L << (PARTITION - 86)) | (1L << (RANGE - 86)) | (1L << (ROWS - 86)) | (1L << (PRECEDING - 86)) | (1L << (FOLLOWING - 86)) | (1L << (CURRENT - 86)) | (1L << (ROW - 86)) | (1L << (VIEW - 86)) | (1L << (REPLACE - 86)) | (1L << (GRANT - 86)) | (1L << (REVOKE - 86)) | (1L << (PRIVILEGES - 86)) | (1L << (PUBLIC - 86)) | (1L << (OPTION - 86)) | (1L << (EXPLAIN - 86)) | (1L << (ANALYZE - 86)) | (1L << (FORMAT - 86)) | (1L << (TYPE - 86)) | (1L << (TEXT - 86)) | (1L << (GRAPHVIZ - 86)) | (1L << (LOGICAL - 86)) | (1L << (DISTRIBUTED - 86)) | (1L << (TRY - 86)) | (1L << (SHOW - 86)) | (1L << (TABLES - 86)) | (1L << (SCHEMAS - 86)) | (1L << (CATALOGS - 86)) | (1L << (COLUMNS - 86)) | (1L << (COLUMN - 86)) | (1L << (USE - 86)) | (1L << (PARTITIONS - 86)) | (1L << (FUNCTIONS - 86)) | (1L << (TO - 86)) | (1L << (SYSTEM - 86)) | (1L << (BERNOULLI - 86)) | (1L << (POISSONIZED - 86)) | (1L << (TABLESAMPLE - 86)) | (1L << (RESCALED - 86)) | (1L << (ARRAY - 86)) | (1L << (MAP - 86)) | (1L << (SET - 86)))) != 0) || ((((_la - 150)) & ~0x3f) == 0 && ((1L << (_la - 150)) & ((1L << (RESET - 150)) | (1L << (SESSION - 150)) | (1L << (DATA - 150)) | (1L << (START - 150)) | (1L << (TRANSACTION - 150)) | (1L << (COMMIT - 150)) | (1L << (ROLLBACK - 150)) | (1L << (WORK - 150)) | (1L << (ISOLATION - 150)) | (1L << (LEVEL - 150)) | (1L << (SERIALIZABLE - 150)) | (1L << (REPEATABLE - 150)) | (1L << (COMMITTED - 150)) | (1L << (UNCOMMITTED - 150)) | (1L << (READ - 150)) | (1L << (WRITE - 150)) | (1L << (ONLY - 150)) | (1L << (CALL - 150)) | (1L << (NFD - 150)) | (1L << (NFC - 150)) | (1L << (NFKD - 150)) | (1L << (NFKC - 150)) | (1L << (IF - 150)) | (1L << (NULLIF - 150)) | (1L << (COALESCE - 150)) | (1L << (IDENTIFIER - 150)) | (1L << (DIGIT_IDENTIFIER - 150)) | (1L << (QUOTED_IDENTIFIER - 150)) | (1L << (BACKQUOTED_IDENTIFIER - 150)))) != 0)) {
					{
					setState(638);
					qualifiedName();
					setState(643);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(639);
						match(T__2);
						setState(640);
						qualifiedName();
						}
						}
						setState(645);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(648);
				match(T__3);
				}
				break;
			case ADD:
			case APPROXIMATE:
			case AT:
			case CONFIDENCE:
			case NO:
			case SUBSTRING:
			case POSITION:
			case TINYINT:
			case SMALLINT:
			case INTEGER:
			case DATE:
			case TIME:
			case TIMESTAMP:
			case INTERVAL:
			case YEAR:
			case MONTH:
			case DAY:
			case HOUR:
			case MINUTE:
			case SECOND:
			case ZONE:
			case OVER:
			case PARTITION:
			case RANGE:
			case ROWS:
			case PRECEDING:
			case FOLLOWING:
			case CURRENT:
			case ROW:
			case VIEW:
			case REPLACE:
			case GRANT:
			case REVOKE:
			case PRIVILEGES:
			case PUBLIC:
			case OPTION:
			case EXPLAIN:
			case ANALYZE:
			case FORMAT:
			case TYPE:
			case TEXT:
			case GRAPHVIZ:
			case LOGICAL:
			case DISTRIBUTED:
			case TRY:
			case SHOW:
			case TABLES:
			case SCHEMAS:
			case CATALOGS:
			case COLUMNS:
			case COLUMN:
			case USE:
			case PARTITIONS:
			case FUNCTIONS:
			case TO:
			case SYSTEM:
			case BERNOULLI:
			case POISSONIZED:
			case TABLESAMPLE:
			case RESCALED:
			case ARRAY:
			case MAP:
			case SET:
			case RESET:
			case SESSION:
			case DATA:
			case START:
			case TRANSACTION:
			case COMMIT:
			case ROLLBACK:
			case WORK:
			case ISOLATION:
			case LEVEL:
			case SERIALIZABLE:
			case REPEATABLE:
			case COMMITTED:
			case UNCOMMITTED:
			case READ:
			case WRITE:
			case ONLY:
			case CALL:
			case NFD:
			case NFC:
			case NFKD:
			case NFKC:
			case IF:
			case NULLIF:
			case COALESCE:
			case IDENTIFIER:
			case DIGIT_IDENTIFIER:
			case QUOTED_IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				enterOuterAlt(_localctx, 2);
				{
				setState(649);
				qualifiedName();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NamedQueryContext extends ParserRuleContext {
		public IdentifierContext name;
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ColumnAliasesContext columnAliases() {
			return getRuleContext(ColumnAliasesContext.class,0);
		}
		public NamedQueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_namedQuery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNamedQuery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNamedQuery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNamedQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NamedQueryContext namedQuery() throws RecognitionException {
		NamedQueryContext _localctx = new NamedQueryContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_namedQuery);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(652);
			((NamedQueryContext)_localctx).name = identifier();
			setState(654);
			_la = _input.LA(1);
			if (_la==T__1) {
				{
				setState(653);
				columnAliases();
				}
			}

			setState(656);
			match(AS);
			setState(657);
			match(T__1);
			setState(658);
			query();
			setState(659);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SetQuantifierContext extends ParserRuleContext {
		public TerminalNode DISTINCT() { return getToken(SqlBaseParser.DISTINCT, 0); }
		public TerminalNode ALL() { return getToken(SqlBaseParser.ALL, 0); }
		public SetQuantifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setQuantifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSetQuantifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSetQuantifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSetQuantifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetQuantifierContext setQuantifier() throws RecognitionException {
		SetQuantifierContext _localctx = new SetQuantifierContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_setQuantifier);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(661);
			_la = _input.LA(1);
			if ( !(_la==ALL || _la==DISTINCT) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SelectItemContext extends ParserRuleContext {
		public SelectItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_selectItem; }
	 
		public SelectItemContext() { }
		public void copyFrom(SelectItemContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SelectAllContext extends SelectItemContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode ASTERISK() { return getToken(SqlBaseParser.ASTERISK, 0); }
		public SelectAllContext(SelectItemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSelectAll(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSelectAll(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSelectAll(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SelectSingleContext extends SelectItemContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public SelectSingleContext(SelectItemContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSelectSingle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSelectSingle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSelectSingle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SelectItemContext selectItem() throws RecognitionException {
		SelectItemContext _localctx = new SelectItemContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_selectItem);
		int _la;
		try {
			setState(675);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				_localctx = new SelectSingleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(663);
				expression();
				setState(668);
				switch ( getInterpreter().adaptivePredict(_input,78,_ctx) ) {
				case 1:
					{
					setState(665);
					_la = _input.LA(1);
					if (_la==AS) {
						{
						setState(664);
						match(AS);
						}
					}

					setState(667);
					identifier();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new SelectAllContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(670);
				qualifiedName();
				setState(671);
				match(T__0);
				setState(672);
				match(ASTERISK);
				}
				break;
			case 3:
				_localctx = new SelectAllContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(674);
				match(ASTERISK);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationContext extends ParserRuleContext {
		public RelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relation; }
	 
		public RelationContext() { }
		public void copyFrom(RelationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class RelationDefaultContext extends RelationContext {
		public SampledRelationContext sampledRelation() {
			return getRuleContext(SampledRelationContext.class,0);
		}
		public RelationDefaultContext(RelationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRelationDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRelationDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRelationDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class JoinRelationContext extends RelationContext {
		public RelationContext left;
		public SampledRelationContext right;
		public RelationContext rightRelation;
		public List<RelationContext> relation() {
			return getRuleContexts(RelationContext.class);
		}
		public RelationContext relation(int i) {
			return getRuleContext(RelationContext.class,i);
		}
		public TerminalNode CROSS() { return getToken(SqlBaseParser.CROSS, 0); }
		public TerminalNode JOIN() { return getToken(SqlBaseParser.JOIN, 0); }
		public JoinTypeContext joinType() {
			return getRuleContext(JoinTypeContext.class,0);
		}
		public JoinCriteriaContext joinCriteria() {
			return getRuleContext(JoinCriteriaContext.class,0);
		}
		public TerminalNode NATURAL() { return getToken(SqlBaseParser.NATURAL, 0); }
		public SampledRelationContext sampledRelation() {
			return getRuleContext(SampledRelationContext.class,0);
		}
		public JoinRelationContext(RelationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterJoinRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitJoinRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitJoinRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationContext relation() throws RecognitionException {
		return relation(0);
	}

	private RelationContext relation(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		RelationContext _localctx = new RelationContext(_ctx, _parentState);
		RelationContext _prevctx = _localctx;
		int _startState = 40;
		enterRecursionRule(_localctx, 40, RULE_relation, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			_localctx = new RelationDefaultContext(_localctx);
			_ctx = _localctx;
			_prevctx = _localctx;

			setState(678);
			sampledRelation();
			}
			_ctx.stop = _input.LT(-1);
			setState(698);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new JoinRelationContext(new RelationContext(_parentctx, _parentState));
					((JoinRelationContext)_localctx).left = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_relation);
					setState(680);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(694);
					switch (_input.LA(1)) {
					case CROSS:
						{
						setState(681);
						match(CROSS);
						setState(682);
						match(JOIN);
						setState(683);
						((JoinRelationContext)_localctx).right = sampledRelation();
						}
						break;
					case JOIN:
					case INNER:
					case LEFT:
					case RIGHT:
					case FULL:
						{
						setState(684);
						joinType();
						setState(685);
						match(JOIN);
						setState(686);
						((JoinRelationContext)_localctx).rightRelation = relation(0);
						setState(687);
						joinCriteria();
						}
						break;
					case NATURAL:
						{
						setState(689);
						match(NATURAL);
						setState(690);
						joinType();
						setState(691);
						match(JOIN);
						setState(692);
						((JoinRelationContext)_localctx).right = sampledRelation();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(700);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,81,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class JoinTypeContext extends ParserRuleContext {
		public TerminalNode INNER() { return getToken(SqlBaseParser.INNER, 0); }
		public TerminalNode LEFT() { return getToken(SqlBaseParser.LEFT, 0); }
		public TerminalNode OUTER() { return getToken(SqlBaseParser.OUTER, 0); }
		public TerminalNode RIGHT() { return getToken(SqlBaseParser.RIGHT, 0); }
		public TerminalNode FULL() { return getToken(SqlBaseParser.FULL, 0); }
		public JoinTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterJoinType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitJoinType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitJoinType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinTypeContext joinType() throws RecognitionException {
		JoinTypeContext _localctx = new JoinTypeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_joinType);
		int _la;
		try {
			setState(716);
			switch (_input.LA(1)) {
			case JOIN:
			case INNER:
				enterOuterAlt(_localctx, 1);
				{
				setState(702);
				_la = _input.LA(1);
				if (_la==INNER) {
					{
					setState(701);
					match(INNER);
					}
				}

				}
				break;
			case LEFT:
				enterOuterAlt(_localctx, 2);
				{
				setState(704);
				match(LEFT);
				setState(706);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(705);
					match(OUTER);
					}
				}

				}
				break;
			case RIGHT:
				enterOuterAlt(_localctx, 3);
				{
				setState(708);
				match(RIGHT);
				setState(710);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(709);
					match(OUTER);
					}
				}

				}
				break;
			case FULL:
				enterOuterAlt(_localctx, 4);
				{
				setState(712);
				match(FULL);
				setState(714);
				_la = _input.LA(1);
				if (_la==OUTER) {
					{
					setState(713);
					match(OUTER);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinCriteriaContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public TerminalNode USING() { return getToken(SqlBaseParser.USING, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public JoinCriteriaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_joinCriteria; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterJoinCriteria(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitJoinCriteria(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitJoinCriteria(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinCriteriaContext joinCriteria() throws RecognitionException {
		JoinCriteriaContext _localctx = new JoinCriteriaContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_joinCriteria);
		int _la;
		try {
			setState(732);
			switch (_input.LA(1)) {
			case ON:
				enterOuterAlt(_localctx, 1);
				{
				setState(718);
				match(ON);
				setState(719);
				booleanExpression(0);
				}
				break;
			case USING:
				enterOuterAlt(_localctx, 2);
				{
				setState(720);
				match(USING);
				setState(721);
				match(T__1);
				setState(722);
				identifier();
				setState(727);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(723);
					match(T__2);
					setState(724);
					identifier();
					}
					}
					setState(729);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(730);
				match(T__3);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SampledRelationContext extends ParserRuleContext {
		public ExpressionContext percentage;
		public ExpressionContext expression;
		public List<ExpressionContext> stratify = new ArrayList<ExpressionContext>();
		public AliasedRelationContext aliasedRelation() {
			return getRuleContext(AliasedRelationContext.class,0);
		}
		public TerminalNode TABLESAMPLE() { return getToken(SqlBaseParser.TABLESAMPLE, 0); }
		public SampleTypeContext sampleType() {
			return getRuleContext(SampleTypeContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode RESCALED() { return getToken(SqlBaseParser.RESCALED, 0); }
		public TerminalNode STRATIFY() { return getToken(SqlBaseParser.STRATIFY, 0); }
		public TerminalNode ON() { return getToken(SqlBaseParser.ON, 0); }
		public SampledRelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sampledRelation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSampledRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSampledRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSampledRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SampledRelationContext sampledRelation() throws RecognitionException {
		SampledRelationContext _localctx = new SampledRelationContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_sampledRelation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(734);
			aliasedRelation();
			setState(758);
			switch ( getInterpreter().adaptivePredict(_input,92,_ctx) ) {
			case 1:
				{
				setState(735);
				match(TABLESAMPLE);
				setState(736);
				sampleType();
				setState(737);
				match(T__1);
				setState(738);
				((SampledRelationContext)_localctx).percentage = expression();
				setState(739);
				match(T__3);
				setState(741);
				switch ( getInterpreter().adaptivePredict(_input,89,_ctx) ) {
				case 1:
					{
					setState(740);
					match(RESCALED);
					}
					break;
				}
				setState(756);
				switch ( getInterpreter().adaptivePredict(_input,91,_ctx) ) {
				case 1:
					{
					setState(743);
					match(STRATIFY);
					setState(744);
					match(ON);
					setState(745);
					match(T__1);
					setState(746);
					((SampledRelationContext)_localctx).expression = expression();
					((SampledRelationContext)_localctx).stratify.add(((SampledRelationContext)_localctx).expression);
					setState(751);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(747);
						match(T__2);
						setState(748);
						((SampledRelationContext)_localctx).expression = expression();
						((SampledRelationContext)_localctx).stratify.add(((SampledRelationContext)_localctx).expression);
						}
						}
						setState(753);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(754);
					match(T__3);
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SampleTypeContext extends ParserRuleContext {
		public TerminalNode BERNOULLI() { return getToken(SqlBaseParser.BERNOULLI, 0); }
		public TerminalNode SYSTEM() { return getToken(SqlBaseParser.SYSTEM, 0); }
		public TerminalNode POISSONIZED() { return getToken(SqlBaseParser.POISSONIZED, 0); }
		public SampleTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sampleType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSampleType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSampleType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSampleType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SampleTypeContext sampleType() throws RecognitionException {
		SampleTypeContext _localctx = new SampleTypeContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_sampleType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(760);
			_la = _input.LA(1);
			if ( !(((((_la - 137)) & ~0x3f) == 0 && ((1L << (_la - 137)) & ((1L << (SYSTEM - 137)) | (1L << (BERNOULLI - 137)) | (1L << (POISSONIZED - 137)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AliasedRelationContext extends ParserRuleContext {
		public RelationPrimaryContext relationPrimary() {
			return getRuleContext(RelationPrimaryContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public ColumnAliasesContext columnAliases() {
			return getRuleContext(ColumnAliasesContext.class,0);
		}
		public AliasedRelationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aliasedRelation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAliasedRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAliasedRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAliasedRelation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AliasedRelationContext aliasedRelation() throws RecognitionException {
		AliasedRelationContext _localctx = new AliasedRelationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_aliasedRelation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(762);
			relationPrimary();
			setState(770);
			switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
			case 1:
				{
				setState(764);
				_la = _input.LA(1);
				if (_la==AS) {
					{
					setState(763);
					match(AS);
					}
				}

				setState(766);
				identifier();
				setState(768);
				switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
				case 1:
					{
					setState(767);
					columnAliases();
					}
					break;
				}
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ColumnAliasesContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public ColumnAliasesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnAliases; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterColumnAliases(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitColumnAliases(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitColumnAliases(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnAliasesContext columnAliases() throws RecognitionException {
		ColumnAliasesContext _localctx = new ColumnAliasesContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_columnAliases);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(772);
			match(T__1);
			setState(773);
			identifier();
			setState(778);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==T__2) {
				{
				{
				setState(774);
				match(T__2);
				setState(775);
				identifier();
				}
				}
				setState(780);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(781);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RelationPrimaryContext extends ParserRuleContext {
		public RelationPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_relationPrimary; }
	 
		public RelationPrimaryContext() { }
		public void copyFrom(RelationPrimaryContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SubqueryRelationContext extends RelationPrimaryContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public SubqueryRelationContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSubqueryRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSubqueryRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSubqueryRelation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesizedRelationContext extends RelationPrimaryContext {
		public RelationContext relation() {
			return getRuleContext(RelationContext.class,0);
		}
		public ParenthesizedRelationContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterParenthesizedRelation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitParenthesizedRelation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitParenthesizedRelation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnnestContext extends RelationPrimaryContext {
		public TerminalNode UNNEST() { return getToken(SqlBaseParser.UNNEST, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode WITH() { return getToken(SqlBaseParser.WITH, 0); }
		public TerminalNode ORDINALITY() { return getToken(SqlBaseParser.ORDINALITY, 0); }
		public UnnestContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterUnnest(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitUnnest(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitUnnest(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TableNameContext extends RelationPrimaryContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TableNameContext(RelationPrimaryContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RelationPrimaryContext relationPrimary() throws RecognitionException {
		RelationPrimaryContext _localctx = new RelationPrimaryContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_relationPrimary);
		int _la;
		try {
			setState(807);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				_localctx = new TableNameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(783);
				qualifiedName();
				}
				break;
			case 2:
				_localctx = new SubqueryRelationContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(784);
				match(T__1);
				setState(785);
				query();
				setState(786);
				match(T__3);
				}
				break;
			case 3:
				_localctx = new UnnestContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(788);
				match(UNNEST);
				setState(789);
				match(T__1);
				setState(790);
				expression();
				setState(795);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(791);
					match(T__2);
					setState(792);
					expression();
					}
					}
					setState(797);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(798);
				match(T__3);
				setState(801);
				switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
				case 1:
					{
					setState(799);
					match(WITH);
					setState(800);
					match(ORDINALITY);
					}
					break;
				}
				}
				break;
			case 4:
				_localctx = new ParenthesizedRelationContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(803);
				match(T__1);
				setState(804);
				relation(0);
				setState(805);
				match(T__3);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(809);
			booleanExpression(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanExpressionContext extends ParserRuleContext {
		public BooleanExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanExpression; }
	 
		public BooleanExpressionContext() { }
		public void copyFrom(BooleanExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class LogicalNotContext extends BooleanExpressionContext {
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public BooleanExpressionContext booleanExpression() {
			return getRuleContext(BooleanExpressionContext.class,0);
		}
		public LogicalNotContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLogicalNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLogicalNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLogicalNot(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanDefaultContext extends BooleanExpressionContext {
		public PredicatedContext predicated() {
			return getRuleContext(PredicatedContext.class,0);
		}
		public BooleanDefaultContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBooleanDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBooleanDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBooleanDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExistsContext extends BooleanExpressionContext {
		public TerminalNode EXISTS() { return getToken(SqlBaseParser.EXISTS, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public ExistsContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterExists(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitExists(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitExists(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LogicalBinaryContext extends BooleanExpressionContext {
		public BooleanExpressionContext left;
		public Token operator;
		public BooleanExpressionContext right;
		public List<BooleanExpressionContext> booleanExpression() {
			return getRuleContexts(BooleanExpressionContext.class);
		}
		public BooleanExpressionContext booleanExpression(int i) {
			return getRuleContext(BooleanExpressionContext.class,i);
		}
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public TerminalNode OR() { return getToken(SqlBaseParser.OR, 0); }
		public LogicalBinaryContext(BooleanExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLogicalBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLogicalBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLogicalBinary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanExpressionContext booleanExpression() throws RecognitionException {
		return booleanExpression(0);
	}

	private BooleanExpressionContext booleanExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BooleanExpressionContext _localctx = new BooleanExpressionContext(_ctx, _parentState);
		BooleanExpressionContext _prevctx = _localctx;
		int _startState = 58;
		enterRecursionRule(_localctx, 58, RULE_booleanExpression, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(820);
			switch (_input.LA(1)) {
			case NOT:
				{
				_localctx = new LogicalNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(812);
				match(NOT);
				setState(813);
				booleanExpression(4);
				}
				break;
			case T__1:
			case ADD:
			case APPROXIMATE:
			case AT:
			case CONFIDENCE:
			case NO:
			case NULL:
			case TRUE:
			case FALSE:
			case SUBSTRING:
			case POSITION:
			case TINYINT:
			case SMALLINT:
			case INTEGER:
			case DATE:
			case TIME:
			case TIMESTAMP:
			case INTERVAL:
			case YEAR:
			case MONTH:
			case DAY:
			case HOUR:
			case MINUTE:
			case SECOND:
			case ZONE:
			case CURRENT_DATE:
			case CURRENT_TIME:
			case CURRENT_TIMESTAMP:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case EXTRACT:
			case CASE:
			case OVER:
			case PARTITION:
			case RANGE:
			case ROWS:
			case PRECEDING:
			case FOLLOWING:
			case CURRENT:
			case ROW:
			case VIEW:
			case REPLACE:
			case GRANT:
			case REVOKE:
			case PRIVILEGES:
			case PUBLIC:
			case OPTION:
			case EXPLAIN:
			case ANALYZE:
			case FORMAT:
			case TYPE:
			case TEXT:
			case GRAPHVIZ:
			case LOGICAL:
			case DISTRIBUTED:
			case TRY:
			case CAST:
			case TRY_CAST:
			case SHOW:
			case TABLES:
			case SCHEMAS:
			case CATALOGS:
			case COLUMNS:
			case COLUMN:
			case USE:
			case PARTITIONS:
			case FUNCTIONS:
			case TO:
			case SYSTEM:
			case BERNOULLI:
			case POISSONIZED:
			case TABLESAMPLE:
			case RESCALED:
			case ARRAY:
			case MAP:
			case SET:
			case RESET:
			case SESSION:
			case DATA:
			case START:
			case TRANSACTION:
			case COMMIT:
			case ROLLBACK:
			case WORK:
			case ISOLATION:
			case LEVEL:
			case SERIALIZABLE:
			case REPEATABLE:
			case COMMITTED:
			case UNCOMMITTED:
			case READ:
			case WRITE:
			case ONLY:
			case CALL:
			case NORMALIZE:
			case NFD:
			case NFC:
			case NFKD:
			case NFKC:
			case IF:
			case NULLIF:
			case COALESCE:
			case PLUS:
			case MINUS:
			case STRING:
			case BINARY_LITERAL:
			case INTEGER_VALUE:
			case DECIMAL_VALUE:
			case IDENTIFIER:
			case DIGIT_IDENTIFIER:
			case QUOTED_IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				{
				_localctx = new BooleanDefaultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(814);
				predicated();
				}
				break;
			case EXISTS:
				{
				_localctx = new ExistsContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(815);
				match(EXISTS);
				setState(816);
				match(T__1);
				setState(817);
				query();
				setState(818);
				match(T__3);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(830);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(828);
					switch ( getInterpreter().adaptivePredict(_input,101,_ctx) ) {
					case 1:
						{
						_localctx = new LogicalBinaryContext(new BooleanExpressionContext(_parentctx, _parentState));
						((LogicalBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(822);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(823);
						((LogicalBinaryContext)_localctx).operator = match(AND);
						setState(824);
						((LogicalBinaryContext)_localctx).right = booleanExpression(4);
						}
						break;
					case 2:
						{
						_localctx = new LogicalBinaryContext(new BooleanExpressionContext(_parentctx, _parentState));
						((LogicalBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_booleanExpression);
						setState(825);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(826);
						((LogicalBinaryContext)_localctx).operator = match(OR);
						setState(827);
						((LogicalBinaryContext)_localctx).right = booleanExpression(3);
						}
						break;
					}
					} 
				}
				setState(832);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,102,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PredicatedContext extends ParserRuleContext {
		public ValueExpressionContext valueExpression;
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public PredicatedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicated; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPredicated(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPredicated(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPredicated(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicatedContext predicated() throws RecognitionException {
		PredicatedContext _localctx = new PredicatedContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_predicated);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(833);
			((PredicatedContext)_localctx).valueExpression = valueExpression(0);
			setState(835);
			switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
			case 1:
				{
				setState(834);
				predicate(((PredicatedContext)_localctx).valueExpression);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PredicateContext extends ParserRuleContext {
		public ParserRuleContext value;
		public PredicateContext(ParserRuleContext parent, int invokingState) { super(parent, invokingState); }
		public PredicateContext(ParserRuleContext parent, int invokingState, ParserRuleContext value) {
			super(parent, invokingState);
			this.value = value;
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
	 
		public PredicateContext() { }
		public void copyFrom(PredicateContext ctx) {
			super.copyFrom(ctx);
			this.value = ctx.value;
		}
	}
	public static class ComparisonContext extends PredicateContext {
		public ValueExpressionContext right;
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public ComparisonContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitComparison(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LikeContext extends PredicateContext {
		public ValueExpressionContext pattern;
		public ValueExpressionContext escape;
		public TerminalNode LIKE() { return getToken(SqlBaseParser.LIKE, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public TerminalNode ESCAPE() { return getToken(SqlBaseParser.ESCAPE, 0); }
		public LikeContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLike(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLike(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLike(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InSubqueryContext extends PredicateContext {
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public InSubqueryContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInSubquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInSubquery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInSubquery(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DistinctFromContext extends PredicateContext {
		public ValueExpressionContext right;
		public TerminalNode IS() { return getToken(SqlBaseParser.IS, 0); }
		public TerminalNode DISTINCT() { return getToken(SqlBaseParser.DISTINCT, 0); }
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public DistinctFromContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDistinctFrom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDistinctFrom(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDistinctFrom(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class InListContext extends PredicateContext {
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public InListContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInList(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NullPredicateContext extends PredicateContext {
		public TerminalNode IS() { return getToken(SqlBaseParser.IS, 0); }
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public NullPredicateContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNullPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNullPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNullPredicate(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BetweenContext extends PredicateContext {
		public ValueExpressionContext lower;
		public ValueExpressionContext upper;
		public TerminalNode BETWEEN() { return getToken(SqlBaseParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode NOT() { return getToken(SqlBaseParser.NOT, 0); }
		public BetweenContext(PredicateContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBetween(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBetween(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBetween(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateContext predicate(ParserRuleContext value) throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState(), value);
		enterRule(_localctx, 62, RULE_predicate);
		int _la;
		try {
			setState(892);
			switch ( getInterpreter().adaptivePredict(_input,112,_ctx) ) {
			case 1:
				_localctx = new ComparisonContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(837);
				comparisonOperator();
				setState(838);
				((ComparisonContext)_localctx).right = valueExpression(0);
				}
				break;
			case 2:
				_localctx = new BetweenContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(841);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(840);
					match(NOT);
					}
				}

				setState(843);
				match(BETWEEN);
				setState(844);
				((BetweenContext)_localctx).lower = valueExpression(0);
				setState(845);
				match(AND);
				setState(846);
				((BetweenContext)_localctx).upper = valueExpression(0);
				}
				break;
			case 3:
				_localctx = new InListContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(849);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(848);
					match(NOT);
					}
				}

				setState(851);
				match(IN);
				setState(852);
				match(T__1);
				setState(853);
				expression();
				setState(858);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(854);
					match(T__2);
					setState(855);
					expression();
					}
					}
					setState(860);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(861);
				match(T__3);
				}
				break;
			case 4:
				_localctx = new InSubqueryContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(864);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(863);
					match(NOT);
					}
				}

				setState(866);
				match(IN);
				setState(867);
				match(T__1);
				setState(868);
				query();
				setState(869);
				match(T__3);
				}
				break;
			case 5:
				_localctx = new LikeContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(872);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(871);
					match(NOT);
					}
				}

				setState(874);
				match(LIKE);
				setState(875);
				((LikeContext)_localctx).pattern = valueExpression(0);
				setState(878);
				switch ( getInterpreter().adaptivePredict(_input,109,_ctx) ) {
				case 1:
					{
					setState(876);
					match(ESCAPE);
					setState(877);
					((LikeContext)_localctx).escape = valueExpression(0);
					}
					break;
				}
				}
				break;
			case 6:
				_localctx = new NullPredicateContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(880);
				match(IS);
				setState(882);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(881);
					match(NOT);
					}
				}

				setState(884);
				match(NULL);
				}
				break;
			case 7:
				_localctx = new DistinctFromContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(885);
				match(IS);
				setState(887);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(886);
					match(NOT);
					}
				}

				setState(889);
				match(DISTINCT);
				setState(890);
				match(FROM);
				setState(891);
				((DistinctFromContext)_localctx).right = valueExpression(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ValueExpressionContext extends ParserRuleContext {
		public ValueExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valueExpression; }
	 
		public ValueExpressionContext() { }
		public void copyFrom(ValueExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ValueExpressionDefaultContext extends ValueExpressionContext {
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public ValueExpressionDefaultContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterValueExpressionDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitValueExpressionDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitValueExpressionDefault(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ConcatenationContext extends ValueExpressionContext {
		public ValueExpressionContext left;
		public ValueExpressionContext right;
		public TerminalNode CONCAT() { return getToken(SqlBaseParser.CONCAT, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public ConcatenationContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterConcatenation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitConcatenation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitConcatenation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticBinaryContext extends ValueExpressionContext {
		public ValueExpressionContext left;
		public Token operator;
		public ValueExpressionContext right;
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode ASTERISK() { return getToken(SqlBaseParser.ASTERISK, 0); }
		public TerminalNode SLASH() { return getToken(SqlBaseParser.SLASH, 0); }
		public TerminalNode PERCENT() { return getToken(SqlBaseParser.PERCENT, 0); }
		public TerminalNode PLUS() { return getToken(SqlBaseParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public ArithmeticBinaryContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterArithmeticBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitArithmeticBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitArithmeticBinary(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArithmeticUnaryContext extends ValueExpressionContext {
		public Token operator;
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public TerminalNode PLUS() { return getToken(SqlBaseParser.PLUS, 0); }
		public ArithmeticUnaryContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterArithmeticUnary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitArithmeticUnary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitArithmeticUnary(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AtTimeZoneContext extends ValueExpressionContext {
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public TerminalNode AT() { return getToken(SqlBaseParser.AT, 0); }
		public TimeZoneSpecifierContext timeZoneSpecifier() {
			return getRuleContext(TimeZoneSpecifierContext.class,0);
		}
		public AtTimeZoneContext(ValueExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterAtTimeZone(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitAtTimeZone(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitAtTimeZone(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValueExpressionContext valueExpression() throws RecognitionException {
		return valueExpression(0);
	}

	private ValueExpressionContext valueExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ValueExpressionContext _localctx = new ValueExpressionContext(_ctx, _parentState);
		ValueExpressionContext _prevctx = _localctx;
		int _startState = 64;
		enterRecursionRule(_localctx, 64, RULE_valueExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(898);
			switch (_input.LA(1)) {
			case PLUS:
			case MINUS:
				{
				_localctx = new ArithmeticUnaryContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(895);
				((ArithmeticUnaryContext)_localctx).operator = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
					((ArithmeticUnaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				setState(896);
				valueExpression(4);
				}
				break;
			case T__1:
			case ADD:
			case APPROXIMATE:
			case AT:
			case CONFIDENCE:
			case NO:
			case NULL:
			case TRUE:
			case FALSE:
			case SUBSTRING:
			case POSITION:
			case TINYINT:
			case SMALLINT:
			case INTEGER:
			case DATE:
			case TIME:
			case TIMESTAMP:
			case INTERVAL:
			case YEAR:
			case MONTH:
			case DAY:
			case HOUR:
			case MINUTE:
			case SECOND:
			case ZONE:
			case CURRENT_DATE:
			case CURRENT_TIME:
			case CURRENT_TIMESTAMP:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case EXTRACT:
			case CASE:
			case OVER:
			case PARTITION:
			case RANGE:
			case ROWS:
			case PRECEDING:
			case FOLLOWING:
			case CURRENT:
			case ROW:
			case VIEW:
			case REPLACE:
			case GRANT:
			case REVOKE:
			case PRIVILEGES:
			case PUBLIC:
			case OPTION:
			case EXPLAIN:
			case ANALYZE:
			case FORMAT:
			case TYPE:
			case TEXT:
			case GRAPHVIZ:
			case LOGICAL:
			case DISTRIBUTED:
			case TRY:
			case CAST:
			case TRY_CAST:
			case SHOW:
			case TABLES:
			case SCHEMAS:
			case CATALOGS:
			case COLUMNS:
			case COLUMN:
			case USE:
			case PARTITIONS:
			case FUNCTIONS:
			case TO:
			case SYSTEM:
			case BERNOULLI:
			case POISSONIZED:
			case TABLESAMPLE:
			case RESCALED:
			case ARRAY:
			case MAP:
			case SET:
			case RESET:
			case SESSION:
			case DATA:
			case START:
			case TRANSACTION:
			case COMMIT:
			case ROLLBACK:
			case WORK:
			case ISOLATION:
			case LEVEL:
			case SERIALIZABLE:
			case REPEATABLE:
			case COMMITTED:
			case UNCOMMITTED:
			case READ:
			case WRITE:
			case ONLY:
			case CALL:
			case NORMALIZE:
			case NFD:
			case NFC:
			case NFKD:
			case NFKC:
			case IF:
			case NULLIF:
			case COALESCE:
			case STRING:
			case BINARY_LITERAL:
			case INTEGER_VALUE:
			case DECIMAL_VALUE:
			case IDENTIFIER:
			case DIGIT_IDENTIFIER:
			case QUOTED_IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				{
				_localctx = new ValueExpressionDefaultContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(897);
				primaryExpression(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(914);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(912);
					switch ( getInterpreter().adaptivePredict(_input,114,_ctx) ) {
					case 1:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(900);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(901);
						((ArithmeticBinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(((((_la - 187)) & ~0x3f) == 0 && ((1L << (_la - 187)) & ((1L << (ASTERISK - 187)) | (1L << (SLASH - 187)) | (1L << (PERCENT - 187)))) != 0)) ) {
							((ArithmeticBinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(902);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(4);
						}
						break;
					case 2:
						{
						_localctx = new ArithmeticBinaryContext(new ValueExpressionContext(_parentctx, _parentState));
						((ArithmeticBinaryContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(903);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(904);
						((ArithmeticBinaryContext)_localctx).operator = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((ArithmeticBinaryContext)_localctx).operator = (Token)_errHandler.recoverInline(this);
						} else {
							consume();
						}
						setState(905);
						((ArithmeticBinaryContext)_localctx).right = valueExpression(3);
						}
						break;
					case 3:
						{
						_localctx = new ConcatenationContext(new ValueExpressionContext(_parentctx, _parentState));
						((ConcatenationContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(906);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(907);
						match(CONCAT);
						setState(908);
						((ConcatenationContext)_localctx).right = valueExpression(2);
						}
						break;
					case 4:
						{
						_localctx = new AtTimeZoneContext(new ValueExpressionContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_valueExpression);
						setState(909);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(910);
						match(AT);
						setState(911);
						timeZoneSpecifier();
						}
						break;
					}
					} 
				}
				setState(916);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,115,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class PrimaryExpressionContext extends ParserRuleContext {
		public PrimaryExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_primaryExpression; }
	 
		public PrimaryExpressionContext() { }
		public void copyFrom(PrimaryExpressionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DereferenceContext extends PrimaryExpressionContext {
		public PrimaryExpressionContext base;
		public IdentifierContext fieldName;
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public DereferenceContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDereference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDereference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDereference(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SimpleCaseContext extends PrimaryExpressionContext {
		public ExpressionContext elseExpression;
		public TerminalNode CASE() { return getToken(SqlBaseParser.CASE, 0); }
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public TerminalNode END() { return getToken(SqlBaseParser.END, 0); }
		public List<WhenClauseContext> whenClause() {
			return getRuleContexts(WhenClauseContext.class);
		}
		public WhenClauseContext whenClause(int i) {
			return getRuleContext(WhenClauseContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(SqlBaseParser.ELSE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SimpleCaseContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSimpleCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSimpleCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSimpleCase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ColumnReferenceContext extends PrimaryExpressionContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ColumnReferenceContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterColumnReference(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitColumnReference(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitColumnReference(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NullLiteralContext extends PrimaryExpressionContext {
		public TerminalNode NULL() { return getToken(SqlBaseParser.NULL, 0); }
		public NullLiteralContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNullLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNullLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNullLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RowConstructorContext extends PrimaryExpressionContext {
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public TerminalNode ROW() { return getToken(SqlBaseParser.ROW, 0); }
		public RowConstructorContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRowConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRowConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRowConstructor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubscriptContext extends PrimaryExpressionContext {
		public PrimaryExpressionContext value;
		public ValueExpressionContext index;
		public PrimaryExpressionContext primaryExpression() {
			return getRuleContext(PrimaryExpressionContext.class,0);
		}
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public SubscriptContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSubscript(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSubscript(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSubscript(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TypeConstructorContext extends PrimaryExpressionContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TypeConstructorContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTypeConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTypeConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTypeConstructor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SpecialDateTimeFunctionContext extends PrimaryExpressionContext {
		public Token name;
		public Token precision;
		public TerminalNode CURRENT_DATE() { return getToken(SqlBaseParser.CURRENT_DATE, 0); }
		public TerminalNode CURRENT_TIME() { return getToken(SqlBaseParser.CURRENT_TIME, 0); }
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public TerminalNode CURRENT_TIMESTAMP() { return getToken(SqlBaseParser.CURRENT_TIMESTAMP, 0); }
		public TerminalNode LOCALTIME() { return getToken(SqlBaseParser.LOCALTIME, 0); }
		public TerminalNode LOCALTIMESTAMP() { return getToken(SqlBaseParser.LOCALTIMESTAMP, 0); }
		public SpecialDateTimeFunctionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSpecialDateTimeFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSpecialDateTimeFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSpecialDateTimeFunction(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubqueryExpressionContext extends PrimaryExpressionContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public SubqueryExpressionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSubqueryExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSubqueryExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSubqueryExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SubstringContext extends PrimaryExpressionContext {
		public TerminalNode SUBSTRING() { return getToken(SqlBaseParser.SUBSTRING, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public TerminalNode FOR() { return getToken(SqlBaseParser.FOR, 0); }
		public SubstringContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSubstring(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSubstring(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSubstring(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BinaryLiteralContext extends PrimaryExpressionContext {
		public TerminalNode BINARY_LITERAL() { return getToken(SqlBaseParser.BINARY_LITERAL, 0); }
		public BinaryLiteralContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBinaryLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBinaryLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBinaryLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CastContext extends PrimaryExpressionContext {
		public TerminalNode CAST() { return getToken(SqlBaseParser.CAST, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode AS() { return getToken(SqlBaseParser.AS, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TerminalNode TRY_CAST() { return getToken(SqlBaseParser.TRY_CAST, 0); }
		public CastContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCast(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCast(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCast(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class LambdaContext extends PrimaryExpressionContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LambdaContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterLambda(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitLambda(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitLambda(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExtractContext extends PrimaryExpressionContext {
		public TerminalNode EXTRACT() { return getToken(SqlBaseParser.EXTRACT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SqlBaseParser.FROM, 0); }
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public ExtractContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterExtract(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitExtract(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitExtract(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ParenthesizedExpressionContext extends PrimaryExpressionContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public ParenthesizedExpressionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterParenthesizedExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitParenthesizedExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitParenthesizedExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class StringLiteralContext extends PrimaryExpressionContext {
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public StringLiteralContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterStringLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitStringLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitStringLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ArrayConstructorContext extends PrimaryExpressionContext {
		public TerminalNode ARRAY() { return getToken(SqlBaseParser.ARRAY, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ArrayConstructorContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterArrayConstructor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitArrayConstructor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitArrayConstructor(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class FunctionCallContext extends PrimaryExpressionContext {
		public QualifiedNameContext qualifiedName() {
			return getRuleContext(QualifiedNameContext.class,0);
		}
		public TerminalNode ASTERISK() { return getToken(SqlBaseParser.ASTERISK, 0); }
		public OverContext over() {
			return getRuleContext(OverContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public SetQuantifierContext setQuantifier() {
			return getRuleContext(SetQuantifierContext.class,0);
		}
		public FunctionCallContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NormalizeContext extends PrimaryExpressionContext {
		public TerminalNode NORMALIZE() { return getToken(SqlBaseParser.NORMALIZE, 0); }
		public ValueExpressionContext valueExpression() {
			return getRuleContext(ValueExpressionContext.class,0);
		}
		public NormalFormContext normalForm() {
			return getRuleContext(NormalFormContext.class,0);
		}
		public NormalizeContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNormalize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNormalize(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNormalize(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PositionContext extends PrimaryExpressionContext {
		public TerminalNode POSITION() { return getToken(SqlBaseParser.POSITION, 0); }
		public List<ValueExpressionContext> valueExpression() {
			return getRuleContexts(ValueExpressionContext.class);
		}
		public ValueExpressionContext valueExpression(int i) {
			return getRuleContext(ValueExpressionContext.class,i);
		}
		public TerminalNode IN() { return getToken(SqlBaseParser.IN, 0); }
		public PositionContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPosition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPosition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPosition(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SearchedCaseContext extends PrimaryExpressionContext {
		public ExpressionContext elseExpression;
		public TerminalNode CASE() { return getToken(SqlBaseParser.CASE, 0); }
		public TerminalNode END() { return getToken(SqlBaseParser.END, 0); }
		public List<WhenClauseContext> whenClause() {
			return getRuleContexts(WhenClauseContext.class);
		}
		public WhenClauseContext whenClause(int i) {
			return getRuleContext(WhenClauseContext.class,i);
		}
		public TerminalNode ELSE() { return getToken(SqlBaseParser.ELSE, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public SearchedCaseContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSearchedCase(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSearchedCase(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSearchedCase(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntervalLiteralContext extends PrimaryExpressionContext {
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public IntervalLiteralContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIntervalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIntervalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIntervalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NumericLiteralContext extends PrimaryExpressionContext {
		public NumberContext number() {
			return getRuleContext(NumberContext.class,0);
		}
		public NumericLiteralContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNumericLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNumericLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNumericLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BooleanLiteralContext extends PrimaryExpressionContext {
		public BooleanValueContext booleanValue() {
			return getRuleContext(BooleanValueContext.class,0);
		}
		public BooleanLiteralContext(PrimaryExpressionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBooleanLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBooleanLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBooleanLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrimaryExpressionContext primaryExpression() throws RecognitionException {
		return primaryExpression(0);
	}

	private PrimaryExpressionContext primaryExpression(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		PrimaryExpressionContext _localctx = new PrimaryExpressionContext(_ctx, _parentState);
		PrimaryExpressionContext _prevctx = _localctx;
		int _startState = 66;
		enterRecursionRule(_localctx, 66, RULE_primaryExpression, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1112);
			switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
			case 1:
				{
				_localctx = new NullLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(918);
				match(NULL);
				}
				break;
			case 2:
				{
				_localctx = new IntervalLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(919);
				interval();
				}
				break;
			case 3:
				{
				_localctx = new TypeConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(920);
				identifier();
				setState(921);
				match(STRING);
				}
				break;
			case 4:
				{
				_localctx = new NumericLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(923);
				number();
				}
				break;
			case 5:
				{
				_localctx = new BooleanLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(924);
				booleanValue();
				}
				break;
			case 6:
				{
				_localctx = new StringLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(925);
				match(STRING);
				}
				break;
			case 7:
				{
				_localctx = new BinaryLiteralContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(926);
				match(BINARY_LITERAL);
				}
				break;
			case 8:
				{
				_localctx = new PositionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(927);
				match(POSITION);
				setState(928);
				match(T__1);
				setState(929);
				valueExpression(0);
				setState(930);
				match(IN);
				setState(931);
				valueExpression(0);
				setState(932);
				match(T__3);
				}
				break;
			case 9:
				{
				_localctx = new RowConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(934);
				match(T__1);
				setState(935);
				expression();
				setState(938); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(936);
					match(T__2);
					setState(937);
					expression();
					}
					}
					setState(940); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==T__2 );
				setState(942);
				match(T__3);
				}
				break;
			case 10:
				{
				_localctx = new RowConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(944);
				match(ROW);
				setState(945);
				match(T__1);
				setState(946);
				expression();
				setState(951);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(947);
					match(T__2);
					setState(948);
					expression();
					}
					}
					setState(953);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(954);
				match(T__3);
				}
				break;
			case 11:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(956);
				qualifiedName();
				setState(957);
				match(T__1);
				setState(958);
				match(ASTERISK);
				setState(959);
				match(T__3);
				setState(961);
				switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
				case 1:
					{
					setState(960);
					over();
					}
					break;
				}
				}
				break;
			case 12:
				{
				_localctx = new FunctionCallContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(963);
				qualifiedName();
				setState(964);
				match(T__1);
				setState(976);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << ADD) | (1L << ALL) | (1L << DISTINCT) | (1L << APPROXIMATE) | (1L << AT) | (1L << CONFIDENCE) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << SUBSTRING) | (1L << POSITION) | (1L << TINYINT) | (1L << SMALLINT) | (1L << INTEGER) | (1L << DATE) | (1L << TIME) | (1L << TIMESTAMP) | (1L << INTERVAL) | (1L << YEAR) | (1L << MONTH) | (1L << DAY) | (1L << HOUR) | (1L << MINUTE) | (1L << SECOND))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (ZONE - 64)) | (1L << (CURRENT_DATE - 64)) | (1L << (CURRENT_TIME - 64)) | (1L << (CURRENT_TIMESTAMP - 64)) | (1L << (LOCALTIME - 64)) | (1L << (LOCALTIMESTAMP - 64)) | (1L << (EXTRACT - 64)) | (1L << (CASE - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (ROW - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (GRANT - 64)) | (1L << (REVOKE - 64)) | (1L << (PRIVILEGES - 64)) | (1L << (PUBLIC - 64)) | (1L << (OPTION - 64)) | (1L << (EXPLAIN - 64)) | (1L << (ANALYZE - 64)) | (1L << (FORMAT - 64)) | (1L << (TYPE - 64)) | (1L << (TEXT - 64)) | (1L << (GRAPHVIZ - 64)) | (1L << (LOGICAL - 64)) | (1L << (DISTRIBUTED - 64)) | (1L << (TRY - 64)) | (1L << (CAST - 64)) | (1L << (TRY_CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (SCHEMAS - 64)) | (1L << (CATALOGS - 64)) | (1L << (COLUMNS - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (COLUMN - 128)) | (1L << (USE - 128)) | (1L << (PARTITIONS - 128)) | (1L << (FUNCTIONS - 128)) | (1L << (TO - 128)) | (1L << (SYSTEM - 128)) | (1L << (BERNOULLI - 128)) | (1L << (POISSONIZED - 128)) | (1L << (TABLESAMPLE - 128)) | (1L << (RESCALED - 128)) | (1L << (ARRAY - 128)) | (1L << (MAP - 128)) | (1L << (SET - 128)) | (1L << (RESET - 128)) | (1L << (SESSION - 128)) | (1L << (DATA - 128)) | (1L << (START - 128)) | (1L << (TRANSACTION - 128)) | (1L << (COMMIT - 128)) | (1L << (ROLLBACK - 128)) | (1L << (WORK - 128)) | (1L << (ISOLATION - 128)) | (1L << (LEVEL - 128)) | (1L << (SERIALIZABLE - 128)) | (1L << (REPEATABLE - 128)) | (1L << (COMMITTED - 128)) | (1L << (UNCOMMITTED - 128)) | (1L << (READ - 128)) | (1L << (WRITE - 128)) | (1L << (ONLY - 128)) | (1L << (CALL - 128)) | (1L << (NORMALIZE - 128)) | (1L << (NFD - 128)) | (1L << (NFC - 128)) | (1L << (NFKD - 128)) | (1L << (NFKC - 128)) | (1L << (IF - 128)) | (1L << (NULLIF - 128)) | (1L << (COALESCE - 128)) | (1L << (PLUS - 128)) | (1L << (MINUS - 128)) | (1L << (STRING - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (BINARY_LITERAL - 192)) | (1L << (INTEGER_VALUE - 192)) | (1L << (DECIMAL_VALUE - 192)) | (1L << (IDENTIFIER - 192)) | (1L << (DIGIT_IDENTIFIER - 192)) | (1L << (QUOTED_IDENTIFIER - 192)) | (1L << (BACKQUOTED_IDENTIFIER - 192)))) != 0)) {
					{
					setState(966);
					_la = _input.LA(1);
					if (_la==ALL || _la==DISTINCT) {
						{
						setState(965);
						setQuantifier();
						}
					}

					setState(968);
					expression();
					setState(973);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(969);
						match(T__2);
						setState(970);
						expression();
						}
						}
						setState(975);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(978);
				match(T__3);
				setState(980);
				switch ( getInterpreter().adaptivePredict(_input,122,_ctx) ) {
				case 1:
					{
					setState(979);
					over();
					}
					break;
				}
				}
				break;
			case 13:
				{
				_localctx = new LambdaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(982);
				identifier();
				setState(983);
				match(T__4);
				setState(984);
				expression();
				}
				break;
			case 14:
				{
				_localctx = new LambdaContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(986);
				match(T__1);
				setState(987);
				identifier();
				setState(992);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(988);
					match(T__2);
					setState(989);
					identifier();
					}
					}
					setState(994);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(995);
				match(T__3);
				setState(996);
				match(T__4);
				setState(997);
				expression();
				}
				break;
			case 15:
				{
				_localctx = new SubqueryExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(999);
				match(T__1);
				setState(1000);
				query();
				setState(1001);
				match(T__3);
				}
				break;
			case 16:
				{
				_localctx = new SimpleCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1003);
				match(CASE);
				setState(1004);
				valueExpression(0);
				setState(1006); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1005);
					whenClause();
					}
					}
					setState(1008); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(1012);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(1010);
					match(ELSE);
					setState(1011);
					((SimpleCaseContext)_localctx).elseExpression = expression();
					}
				}

				setState(1014);
				match(END);
				}
				break;
			case 17:
				{
				_localctx = new SearchedCaseContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1016);
				match(CASE);
				setState(1018); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(1017);
					whenClause();
					}
					}
					setState(1020); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( _la==WHEN );
				setState(1024);
				_la = _input.LA(1);
				if (_la==ELSE) {
					{
					setState(1022);
					match(ELSE);
					setState(1023);
					((SearchedCaseContext)_localctx).elseExpression = expression();
					}
				}

				setState(1026);
				match(END);
				}
				break;
			case 18:
				{
				_localctx = new CastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1028);
				match(CAST);
				setState(1029);
				match(T__1);
				setState(1030);
				expression();
				setState(1031);
				match(AS);
				setState(1032);
				type(0);
				setState(1033);
				match(T__3);
				}
				break;
			case 19:
				{
				_localctx = new CastContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1035);
				match(TRY_CAST);
				setState(1036);
				match(T__1);
				setState(1037);
				expression();
				setState(1038);
				match(AS);
				setState(1039);
				type(0);
				setState(1040);
				match(T__3);
				}
				break;
			case 20:
				{
				_localctx = new ArrayConstructorContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1042);
				match(ARRAY);
				setState(1043);
				match(T__5);
				setState(1052);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << ADD) | (1L << APPROXIMATE) | (1L << AT) | (1L << CONFIDENCE) | (1L << NOT) | (1L << NO) | (1L << EXISTS) | (1L << NULL) | (1L << TRUE) | (1L << FALSE) | (1L << SUBSTRING) | (1L << POSITION) | (1L << TINYINT) | (1L << SMALLINT) | (1L << INTEGER) | (1L << DATE) | (1L << TIME) | (1L << TIMESTAMP) | (1L << INTERVAL) | (1L << YEAR) | (1L << MONTH) | (1L << DAY) | (1L << HOUR) | (1L << MINUTE) | (1L << SECOND))) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & ((1L << (ZONE - 64)) | (1L << (CURRENT_DATE - 64)) | (1L << (CURRENT_TIME - 64)) | (1L << (CURRENT_TIMESTAMP - 64)) | (1L << (LOCALTIME - 64)) | (1L << (LOCALTIMESTAMP - 64)) | (1L << (EXTRACT - 64)) | (1L << (CASE - 64)) | (1L << (OVER - 64)) | (1L << (PARTITION - 64)) | (1L << (RANGE - 64)) | (1L << (ROWS - 64)) | (1L << (PRECEDING - 64)) | (1L << (FOLLOWING - 64)) | (1L << (CURRENT - 64)) | (1L << (ROW - 64)) | (1L << (VIEW - 64)) | (1L << (REPLACE - 64)) | (1L << (GRANT - 64)) | (1L << (REVOKE - 64)) | (1L << (PRIVILEGES - 64)) | (1L << (PUBLIC - 64)) | (1L << (OPTION - 64)) | (1L << (EXPLAIN - 64)) | (1L << (ANALYZE - 64)) | (1L << (FORMAT - 64)) | (1L << (TYPE - 64)) | (1L << (TEXT - 64)) | (1L << (GRAPHVIZ - 64)) | (1L << (LOGICAL - 64)) | (1L << (DISTRIBUTED - 64)) | (1L << (TRY - 64)) | (1L << (CAST - 64)) | (1L << (TRY_CAST - 64)) | (1L << (SHOW - 64)) | (1L << (TABLES - 64)) | (1L << (SCHEMAS - 64)) | (1L << (CATALOGS - 64)) | (1L << (COLUMNS - 64)))) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & ((1L << (COLUMN - 128)) | (1L << (USE - 128)) | (1L << (PARTITIONS - 128)) | (1L << (FUNCTIONS - 128)) | (1L << (TO - 128)) | (1L << (SYSTEM - 128)) | (1L << (BERNOULLI - 128)) | (1L << (POISSONIZED - 128)) | (1L << (TABLESAMPLE - 128)) | (1L << (RESCALED - 128)) | (1L << (ARRAY - 128)) | (1L << (MAP - 128)) | (1L << (SET - 128)) | (1L << (RESET - 128)) | (1L << (SESSION - 128)) | (1L << (DATA - 128)) | (1L << (START - 128)) | (1L << (TRANSACTION - 128)) | (1L << (COMMIT - 128)) | (1L << (ROLLBACK - 128)) | (1L << (WORK - 128)) | (1L << (ISOLATION - 128)) | (1L << (LEVEL - 128)) | (1L << (SERIALIZABLE - 128)) | (1L << (REPEATABLE - 128)) | (1L << (COMMITTED - 128)) | (1L << (UNCOMMITTED - 128)) | (1L << (READ - 128)) | (1L << (WRITE - 128)) | (1L << (ONLY - 128)) | (1L << (CALL - 128)) | (1L << (NORMALIZE - 128)) | (1L << (NFD - 128)) | (1L << (NFC - 128)) | (1L << (NFKD - 128)) | (1L << (NFKC - 128)) | (1L << (IF - 128)) | (1L << (NULLIF - 128)) | (1L << (COALESCE - 128)) | (1L << (PLUS - 128)) | (1L << (MINUS - 128)) | (1L << (STRING - 128)))) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & ((1L << (BINARY_LITERAL - 192)) | (1L << (INTEGER_VALUE - 192)) | (1L << (DECIMAL_VALUE - 192)) | (1L << (IDENTIFIER - 192)) | (1L << (DIGIT_IDENTIFIER - 192)) | (1L << (QUOTED_IDENTIFIER - 192)) | (1L << (BACKQUOTED_IDENTIFIER - 192)))) != 0)) {
					{
					setState(1044);
					expression();
					setState(1049);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(1045);
						match(T__2);
						setState(1046);
						expression();
						}
						}
						setState(1051);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(1054);
				match(T__6);
				}
				break;
			case 21:
				{
				_localctx = new ColumnReferenceContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1055);
				identifier();
				}
				break;
			case 22:
				{
				_localctx = new SpecialDateTimeFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1056);
				((SpecialDateTimeFunctionContext)_localctx).name = match(CURRENT_DATE);
				}
				break;
			case 23:
				{
				_localctx = new SpecialDateTimeFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1057);
				((SpecialDateTimeFunctionContext)_localctx).name = match(CURRENT_TIME);
				setState(1061);
				switch ( getInterpreter().adaptivePredict(_input,130,_ctx) ) {
				case 1:
					{
					setState(1058);
					match(T__1);
					setState(1059);
					((SpecialDateTimeFunctionContext)_localctx).precision = match(INTEGER_VALUE);
					setState(1060);
					match(T__3);
					}
					break;
				}
				}
				break;
			case 24:
				{
				_localctx = new SpecialDateTimeFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1063);
				((SpecialDateTimeFunctionContext)_localctx).name = match(CURRENT_TIMESTAMP);
				setState(1067);
				switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
				case 1:
					{
					setState(1064);
					match(T__1);
					setState(1065);
					((SpecialDateTimeFunctionContext)_localctx).precision = match(INTEGER_VALUE);
					setState(1066);
					match(T__3);
					}
					break;
				}
				}
				break;
			case 25:
				{
				_localctx = new SpecialDateTimeFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1069);
				((SpecialDateTimeFunctionContext)_localctx).name = match(LOCALTIME);
				setState(1073);
				switch ( getInterpreter().adaptivePredict(_input,132,_ctx) ) {
				case 1:
					{
					setState(1070);
					match(T__1);
					setState(1071);
					((SpecialDateTimeFunctionContext)_localctx).precision = match(INTEGER_VALUE);
					setState(1072);
					match(T__3);
					}
					break;
				}
				}
				break;
			case 26:
				{
				_localctx = new SpecialDateTimeFunctionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1075);
				((SpecialDateTimeFunctionContext)_localctx).name = match(LOCALTIMESTAMP);
				setState(1079);
				switch ( getInterpreter().adaptivePredict(_input,133,_ctx) ) {
				case 1:
					{
					setState(1076);
					match(T__1);
					setState(1077);
					((SpecialDateTimeFunctionContext)_localctx).precision = match(INTEGER_VALUE);
					setState(1078);
					match(T__3);
					}
					break;
				}
				}
				break;
			case 27:
				{
				_localctx = new SubstringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1081);
				match(SUBSTRING);
				setState(1082);
				match(T__1);
				setState(1083);
				valueExpression(0);
				setState(1084);
				match(FROM);
				setState(1085);
				valueExpression(0);
				setState(1088);
				_la = _input.LA(1);
				if (_la==FOR) {
					{
					setState(1086);
					match(FOR);
					setState(1087);
					valueExpression(0);
					}
				}

				setState(1090);
				match(T__3);
				}
				break;
			case 28:
				{
				_localctx = new NormalizeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1092);
				match(NORMALIZE);
				setState(1093);
				match(T__1);
				setState(1094);
				valueExpression(0);
				setState(1097);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(1095);
					match(T__2);
					setState(1096);
					normalForm();
					}
				}

				setState(1099);
				match(T__3);
				}
				break;
			case 29:
				{
				_localctx = new ExtractContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1101);
				match(EXTRACT);
				setState(1102);
				match(T__1);
				setState(1103);
				identifier();
				setState(1104);
				match(FROM);
				setState(1105);
				valueExpression(0);
				setState(1106);
				match(T__3);
				}
				break;
			case 30:
				{
				_localctx = new ParenthesizedExpressionContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1108);
				match(T__1);
				setState(1109);
				expression();
				setState(1110);
				match(T__3);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1124);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,138,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1122);
					switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
					case 1:
						{
						_localctx = new SubscriptContext(new PrimaryExpressionContext(_parentctx, _parentState));
						((SubscriptContext)_localctx).value = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(1114);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(1115);
						match(T__5);
						setState(1116);
						((SubscriptContext)_localctx).index = valueExpression(0);
						setState(1117);
						match(T__6);
						}
						break;
					case 2:
						{
						_localctx = new DereferenceContext(new PrimaryExpressionContext(_parentctx, _parentState));
						((DereferenceContext)_localctx).base = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_primaryExpression);
						setState(1119);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1120);
						match(T__0);
						setState(1121);
						((DereferenceContext)_localctx).fieldName = identifier();
						}
						break;
					}
					} 
				}
				setState(1126);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,138,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TimeZoneSpecifierContext extends ParserRuleContext {
		public TimeZoneSpecifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_timeZoneSpecifier; }
	 
		public TimeZoneSpecifierContext() { }
		public void copyFrom(TimeZoneSpecifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TimeZoneIntervalContext extends TimeZoneSpecifierContext {
		public TerminalNode TIME() { return getToken(SqlBaseParser.TIME, 0); }
		public TerminalNode ZONE() { return getToken(SqlBaseParser.ZONE, 0); }
		public IntervalContext interval() {
			return getRuleContext(IntervalContext.class,0);
		}
		public TimeZoneIntervalContext(TimeZoneSpecifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTimeZoneInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTimeZoneInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTimeZoneInterval(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class TimeZoneStringContext extends TimeZoneSpecifierContext {
		public TerminalNode TIME() { return getToken(SqlBaseParser.TIME, 0); }
		public TerminalNode ZONE() { return getToken(SqlBaseParser.ZONE, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public TimeZoneStringContext(TimeZoneSpecifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTimeZoneString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTimeZoneString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTimeZoneString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TimeZoneSpecifierContext timeZoneSpecifier() throws RecognitionException {
		TimeZoneSpecifierContext _localctx = new TimeZoneSpecifierContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_timeZoneSpecifier);
		try {
			setState(1133);
			switch ( getInterpreter().adaptivePredict(_input,139,_ctx) ) {
			case 1:
				_localctx = new TimeZoneIntervalContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1127);
				match(TIME);
				setState(1128);
				match(ZONE);
				setState(1129);
				interval();
				}
				break;
			case 2:
				_localctx = new TimeZoneStringContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1130);
				match(TIME);
				setState(1131);
				match(ZONE);
				setState(1132);
				match(STRING);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ComparisonOperatorContext extends ParserRuleContext {
		public TerminalNode EQ() { return getToken(SqlBaseParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(SqlBaseParser.NEQ, 0); }
		public TerminalNode LT() { return getToken(SqlBaseParser.LT, 0); }
		public TerminalNode LTE() { return getToken(SqlBaseParser.LTE, 0); }
		public TerminalNode GT() { return getToken(SqlBaseParser.GT, 0); }
		public TerminalNode GTE() { return getToken(SqlBaseParser.GTE, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterComparisonOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitComparisonOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitComparisonOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1135);
			_la = _input.LA(1);
			if ( !(((((_la - 179)) & ~0x3f) == 0 && ((1L << (_la - 179)) & ((1L << (EQ - 179)) | (1L << (NEQ - 179)) | (1L << (LT - 179)) | (1L << (LTE - 179)) | (1L << (GT - 179)) | (1L << (GTE - 179)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BooleanValueContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(SqlBaseParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SqlBaseParser.FALSE, 0); }
		public BooleanValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBooleanValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBooleanValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBooleanValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanValueContext booleanValue() throws RecognitionException {
		BooleanValueContext _localctx = new BooleanValueContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_booleanValue);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1137);
			_la = _input.LA(1);
			if ( !(_la==TRUE || _la==FALSE) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntervalContext extends ParserRuleContext {
		public Token sign;
		public IntervalFieldContext from;
		public IntervalFieldContext to;
		public TerminalNode INTERVAL() { return getToken(SqlBaseParser.INTERVAL, 0); }
		public TerminalNode STRING() { return getToken(SqlBaseParser.STRING, 0); }
		public List<IntervalFieldContext> intervalField() {
			return getRuleContexts(IntervalFieldContext.class);
		}
		public IntervalFieldContext intervalField(int i) {
			return getRuleContext(IntervalFieldContext.class,i);
		}
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public TerminalNode PLUS() { return getToken(SqlBaseParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(SqlBaseParser.MINUS, 0); }
		public IntervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_interval; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterInterval(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitInterval(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitInterval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalContext interval() throws RecognitionException {
		IntervalContext _localctx = new IntervalContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_interval);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1139);
			match(INTERVAL);
			setState(1141);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(1140);
				((IntervalContext)_localctx).sign = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
					((IntervalContext)_localctx).sign = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
			}

			setState(1143);
			match(STRING);
			setState(1144);
			((IntervalContext)_localctx).from = intervalField();
			setState(1147);
			switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
			case 1:
				{
				setState(1145);
				match(TO);
				setState(1146);
				((IntervalContext)_localctx).to = intervalField();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IntervalFieldContext extends ParserRuleContext {
		public TerminalNode YEAR() { return getToken(SqlBaseParser.YEAR, 0); }
		public TerminalNode MONTH() { return getToken(SqlBaseParser.MONTH, 0); }
		public TerminalNode DAY() { return getToken(SqlBaseParser.DAY, 0); }
		public TerminalNode HOUR() { return getToken(SqlBaseParser.HOUR, 0); }
		public TerminalNode MINUTE() { return getToken(SqlBaseParser.MINUTE, 0); }
		public TerminalNode SECOND() { return getToken(SqlBaseParser.SECOND, 0); }
		public IntervalFieldContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalField; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIntervalField(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIntervalField(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIntervalField(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalFieldContext intervalField() throws RecognitionException {
		IntervalFieldContext _localctx = new IntervalFieldContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_intervalField);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1149);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << YEAR) | (1L << MONTH) | (1L << DAY) | (1L << HOUR) | (1L << MINUTE) | (1L << SECOND))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public TerminalNode ARRAY() { return getToken(SqlBaseParser.ARRAY, 0); }
		public List<TypeContext> type() {
			return getRuleContexts(TypeContext.class);
		}
		public TypeContext type(int i) {
			return getRuleContext(TypeContext.class,i);
		}
		public TerminalNode MAP() { return getToken(SqlBaseParser.MAP, 0); }
		public TerminalNode ROW() { return getToken(SqlBaseParser.ROW, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public BaseTypeContext baseType() {
			return getRuleContext(BaseTypeContext.class,0);
		}
		public List<TypeParameterContext> typeParameter() {
			return getRuleContexts(TypeParameterContext.class);
		}
		public TypeParameterContext typeParameter(int i) {
			return getRuleContext(TypeParameterContext.class,i);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		return type(0);
	}

	private TypeContext type(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		TypeContext _localctx = new TypeContext(_ctx, _parentState);
		TypeContext _prevctx = _localctx;
		int _startState = 78;
		enterRecursionRule(_localctx, 78, RULE_type, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1193);
			switch ( getInterpreter().adaptivePredict(_input,145,_ctx) ) {
			case 1:
				{
				setState(1152);
				match(ARRAY);
				setState(1153);
				match(LT);
				setState(1154);
				type(0);
				setState(1155);
				match(GT);
				}
				break;
			case 2:
				{
				setState(1157);
				match(MAP);
				setState(1158);
				match(LT);
				setState(1159);
				type(0);
				setState(1160);
				match(T__2);
				setState(1161);
				type(0);
				setState(1162);
				match(GT);
				}
				break;
			case 3:
				{
				setState(1164);
				match(ROW);
				setState(1165);
				match(T__1);
				setState(1166);
				identifier();
				setState(1167);
				type(0);
				setState(1174);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1168);
					match(T__2);
					setState(1169);
					identifier();
					setState(1170);
					type(0);
					}
					}
					setState(1176);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(1177);
				match(T__3);
				}
				break;
			case 4:
				{
				setState(1179);
				baseType();
				setState(1191);
				switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
				case 1:
					{
					setState(1180);
					match(T__1);
					setState(1181);
					typeParameter();
					setState(1186);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==T__2) {
						{
						{
						setState(1182);
						match(T__2);
						setState(1183);
						typeParameter();
						}
						}
						setState(1188);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(1189);
					match(T__3);
					}
					break;
				}
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1199);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,146,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new TypeContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_type);
					setState(1195);
					if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
					setState(1196);
					match(ARRAY);
					}
					} 
				}
				setState(1201);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,146,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class TypeParameterContext extends ParserRuleContext {
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public TypeContext type() {
			return getRuleContext(TypeContext.class,0);
		}
		public TypeParameterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeParameter; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTypeParameter(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTypeParameter(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTypeParameter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeParameterContext typeParameter() throws RecognitionException {
		TypeParameterContext _localctx = new TypeParameterContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_typeParameter);
		try {
			setState(1204);
			switch (_input.LA(1)) {
			case INTEGER_VALUE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1202);
				match(INTEGER_VALUE);
				}
				break;
			case ADD:
			case APPROXIMATE:
			case AT:
			case CONFIDENCE:
			case NO:
			case SUBSTRING:
			case POSITION:
			case TINYINT:
			case SMALLINT:
			case INTEGER:
			case DATE:
			case TIME:
			case TIMESTAMP:
			case INTERVAL:
			case YEAR:
			case MONTH:
			case DAY:
			case HOUR:
			case MINUTE:
			case SECOND:
			case ZONE:
			case OVER:
			case PARTITION:
			case RANGE:
			case ROWS:
			case PRECEDING:
			case FOLLOWING:
			case CURRENT:
			case ROW:
			case VIEW:
			case REPLACE:
			case GRANT:
			case REVOKE:
			case PRIVILEGES:
			case PUBLIC:
			case OPTION:
			case EXPLAIN:
			case ANALYZE:
			case FORMAT:
			case TYPE:
			case TEXT:
			case GRAPHVIZ:
			case LOGICAL:
			case DISTRIBUTED:
			case TRY:
			case SHOW:
			case TABLES:
			case SCHEMAS:
			case CATALOGS:
			case COLUMNS:
			case COLUMN:
			case USE:
			case PARTITIONS:
			case FUNCTIONS:
			case TO:
			case SYSTEM:
			case BERNOULLI:
			case POISSONIZED:
			case TABLESAMPLE:
			case RESCALED:
			case ARRAY:
			case MAP:
			case SET:
			case RESET:
			case SESSION:
			case DATA:
			case START:
			case TRANSACTION:
			case COMMIT:
			case ROLLBACK:
			case WORK:
			case ISOLATION:
			case LEVEL:
			case SERIALIZABLE:
			case REPEATABLE:
			case COMMITTED:
			case UNCOMMITTED:
			case READ:
			case WRITE:
			case ONLY:
			case CALL:
			case NFD:
			case NFC:
			case NFKD:
			case NFKC:
			case IF:
			case NULLIF:
			case COALESCE:
			case IDENTIFIER:
			case DIGIT_IDENTIFIER:
			case QUOTED_IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
			case TIME_WITH_TIME_ZONE:
			case TIMESTAMP_WITH_TIME_ZONE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1203);
				type(0);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BaseTypeContext extends ParserRuleContext {
		public TerminalNode TIME_WITH_TIME_ZONE() { return getToken(SqlBaseParser.TIME_WITH_TIME_ZONE, 0); }
		public TerminalNode TIMESTAMP_WITH_TIME_ZONE() { return getToken(SqlBaseParser.TIMESTAMP_WITH_TIME_ZONE, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public BaseTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_baseType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBaseType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBaseType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBaseType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BaseTypeContext baseType() throws RecognitionException {
		BaseTypeContext _localctx = new BaseTypeContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_baseType);
		try {
			setState(1209);
			switch (_input.LA(1)) {
			case TIME_WITH_TIME_ZONE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1206);
				match(TIME_WITH_TIME_ZONE);
				}
				break;
			case TIMESTAMP_WITH_TIME_ZONE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1207);
				match(TIMESTAMP_WITH_TIME_ZONE);
				}
				break;
			case ADD:
			case APPROXIMATE:
			case AT:
			case CONFIDENCE:
			case NO:
			case SUBSTRING:
			case POSITION:
			case TINYINT:
			case SMALLINT:
			case INTEGER:
			case DATE:
			case TIME:
			case TIMESTAMP:
			case INTERVAL:
			case YEAR:
			case MONTH:
			case DAY:
			case HOUR:
			case MINUTE:
			case SECOND:
			case ZONE:
			case OVER:
			case PARTITION:
			case RANGE:
			case ROWS:
			case PRECEDING:
			case FOLLOWING:
			case CURRENT:
			case ROW:
			case VIEW:
			case REPLACE:
			case GRANT:
			case REVOKE:
			case PRIVILEGES:
			case PUBLIC:
			case OPTION:
			case EXPLAIN:
			case ANALYZE:
			case FORMAT:
			case TYPE:
			case TEXT:
			case GRAPHVIZ:
			case LOGICAL:
			case DISTRIBUTED:
			case TRY:
			case SHOW:
			case TABLES:
			case SCHEMAS:
			case CATALOGS:
			case COLUMNS:
			case COLUMN:
			case USE:
			case PARTITIONS:
			case FUNCTIONS:
			case TO:
			case SYSTEM:
			case BERNOULLI:
			case POISSONIZED:
			case TABLESAMPLE:
			case RESCALED:
			case ARRAY:
			case MAP:
			case SET:
			case RESET:
			case SESSION:
			case DATA:
			case START:
			case TRANSACTION:
			case COMMIT:
			case ROLLBACK:
			case WORK:
			case ISOLATION:
			case LEVEL:
			case SERIALIZABLE:
			case REPEATABLE:
			case COMMITTED:
			case UNCOMMITTED:
			case READ:
			case WRITE:
			case ONLY:
			case CALL:
			case NFD:
			case NFC:
			case NFKD:
			case NFKC:
			case IF:
			case NULLIF:
			case COALESCE:
			case IDENTIFIER:
			case DIGIT_IDENTIFIER:
			case QUOTED_IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				enterOuterAlt(_localctx, 3);
				{
				setState(1208);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WhenClauseContext extends ParserRuleContext {
		public ExpressionContext condition;
		public ExpressionContext result;
		public TerminalNode WHEN() { return getToken(SqlBaseParser.WHEN, 0); }
		public TerminalNode THEN() { return getToken(SqlBaseParser.THEN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public WhenClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_whenClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterWhenClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitWhenClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitWhenClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WhenClauseContext whenClause() throws RecognitionException {
		WhenClauseContext _localctx = new WhenClauseContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_whenClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1211);
			match(WHEN);
			setState(1212);
			((WhenClauseContext)_localctx).condition = expression();
			setState(1213);
			match(THEN);
			setState(1214);
			((WhenClauseContext)_localctx).result = expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OverContext extends ParserRuleContext {
		public ExpressionContext expression;
		public List<ExpressionContext> partition = new ArrayList<ExpressionContext>();
		public TerminalNode OVER() { return getToken(SqlBaseParser.OVER, 0); }
		public TerminalNode PARTITION() { return getToken(SqlBaseParser.PARTITION, 0); }
		public List<TerminalNode> BY() { return getTokens(SqlBaseParser.BY); }
		public TerminalNode BY(int i) {
			return getToken(SqlBaseParser.BY, i);
		}
		public TerminalNode ORDER() { return getToken(SqlBaseParser.ORDER, 0); }
		public List<SortItemContext> sortItem() {
			return getRuleContexts(SortItemContext.class);
		}
		public SortItemContext sortItem(int i) {
			return getRuleContext(SortItemContext.class,i);
		}
		public WindowFrameContext windowFrame() {
			return getRuleContext(WindowFrameContext.class,0);
		}
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public OverContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_over; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterOver(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitOver(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitOver(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OverContext over() throws RecognitionException {
		OverContext _localctx = new OverContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_over);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1216);
			match(OVER);
			setState(1217);
			match(T__1);
			setState(1228);
			_la = _input.LA(1);
			if (_la==PARTITION) {
				{
				setState(1218);
				match(PARTITION);
				setState(1219);
				match(BY);
				setState(1220);
				((OverContext)_localctx).expression = expression();
				((OverContext)_localctx).partition.add(((OverContext)_localctx).expression);
				setState(1225);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1221);
					match(T__2);
					setState(1222);
					((OverContext)_localctx).expression = expression();
					((OverContext)_localctx).partition.add(((OverContext)_localctx).expression);
					}
					}
					setState(1227);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1240);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(1230);
				match(ORDER);
				setState(1231);
				match(BY);
				setState(1232);
				sortItem();
				setState(1237);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__2) {
					{
					{
					setState(1233);
					match(T__2);
					setState(1234);
					sortItem();
					}
					}
					setState(1239);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1243);
			_la = _input.LA(1);
			if (_la==RANGE || _la==ROWS) {
				{
				setState(1242);
				windowFrame();
				}
			}

			setState(1245);
			match(T__3);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowFrameContext extends ParserRuleContext {
		public Token frameType;
		public FrameBoundContext start;
		public FrameBoundContext end;
		public TerminalNode RANGE() { return getToken(SqlBaseParser.RANGE, 0); }
		public List<FrameBoundContext> frameBound() {
			return getRuleContexts(FrameBoundContext.class);
		}
		public FrameBoundContext frameBound(int i) {
			return getRuleContext(FrameBoundContext.class,i);
		}
		public TerminalNode ROWS() { return getToken(SqlBaseParser.ROWS, 0); }
		public TerminalNode BETWEEN() { return getToken(SqlBaseParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(SqlBaseParser.AND, 0); }
		public WindowFrameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowFrame; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterWindowFrame(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitWindowFrame(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitWindowFrame(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowFrameContext windowFrame() throws RecognitionException {
		WindowFrameContext _localctx = new WindowFrameContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_windowFrame);
		try {
			setState(1263);
			switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1247);
				((WindowFrameContext)_localctx).frameType = match(RANGE);
				setState(1248);
				((WindowFrameContext)_localctx).start = frameBound();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1249);
				((WindowFrameContext)_localctx).frameType = match(ROWS);
				setState(1250);
				((WindowFrameContext)_localctx).start = frameBound();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1251);
				((WindowFrameContext)_localctx).frameType = match(RANGE);
				setState(1252);
				match(BETWEEN);
				setState(1253);
				((WindowFrameContext)_localctx).start = frameBound();
				setState(1254);
				match(AND);
				setState(1255);
				((WindowFrameContext)_localctx).end = frameBound();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1257);
				((WindowFrameContext)_localctx).frameType = match(ROWS);
				setState(1258);
				match(BETWEEN);
				setState(1259);
				((WindowFrameContext)_localctx).start = frameBound();
				setState(1260);
				match(AND);
				setState(1261);
				((WindowFrameContext)_localctx).end = frameBound();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FrameBoundContext extends ParserRuleContext {
		public FrameBoundContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frameBound; }
	 
		public FrameBoundContext() { }
		public void copyFrom(FrameBoundContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BoundedFrameContext extends FrameBoundContext {
		public Token boundType;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode PRECEDING() { return getToken(SqlBaseParser.PRECEDING, 0); }
		public TerminalNode FOLLOWING() { return getToken(SqlBaseParser.FOLLOWING, 0); }
		public BoundedFrameContext(FrameBoundContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBoundedFrame(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBoundedFrame(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBoundedFrame(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnboundedFrameContext extends FrameBoundContext {
		public Token boundType;
		public TerminalNode UNBOUNDED() { return getToken(SqlBaseParser.UNBOUNDED, 0); }
		public TerminalNode PRECEDING() { return getToken(SqlBaseParser.PRECEDING, 0); }
		public TerminalNode FOLLOWING() { return getToken(SqlBaseParser.FOLLOWING, 0); }
		public UnboundedFrameContext(FrameBoundContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterUnboundedFrame(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitUnboundedFrame(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitUnboundedFrame(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CurrentRowBoundContext extends FrameBoundContext {
		public TerminalNode CURRENT() { return getToken(SqlBaseParser.CURRENT, 0); }
		public TerminalNode ROW() { return getToken(SqlBaseParser.ROW, 0); }
		public CurrentRowBoundContext(FrameBoundContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterCurrentRowBound(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitCurrentRowBound(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitCurrentRowBound(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FrameBoundContext frameBound() throws RecognitionException {
		FrameBoundContext _localctx = new FrameBoundContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_frameBound);
		int _la;
		try {
			setState(1274);
			switch ( getInterpreter().adaptivePredict(_input,155,_ctx) ) {
			case 1:
				_localctx = new UnboundedFrameContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1265);
				match(UNBOUNDED);
				setState(1266);
				((UnboundedFrameContext)_localctx).boundType = match(PRECEDING);
				}
				break;
			case 2:
				_localctx = new UnboundedFrameContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1267);
				match(UNBOUNDED);
				setState(1268);
				((UnboundedFrameContext)_localctx).boundType = match(FOLLOWING);
				}
				break;
			case 3:
				_localctx = new CurrentRowBoundContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1269);
				match(CURRENT);
				setState(1270);
				match(ROW);
				}
				break;
			case 4:
				_localctx = new BoundedFrameContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1271);
				expression();
				setState(1272);
				((BoundedFrameContext)_localctx).boundType = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==PRECEDING || _la==FOLLOWING) ) {
					((BoundedFrameContext)_localctx).boundType = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExplainOptionContext extends ParserRuleContext {
		public ExplainOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_explainOption; }
	 
		public ExplainOptionContext() { }
		public void copyFrom(ExplainOptionContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExplainFormatContext extends ExplainOptionContext {
		public Token value;
		public TerminalNode FORMAT() { return getToken(SqlBaseParser.FORMAT, 0); }
		public TerminalNode TEXT() { return getToken(SqlBaseParser.TEXT, 0); }
		public TerminalNode GRAPHVIZ() { return getToken(SqlBaseParser.GRAPHVIZ, 0); }
		public ExplainFormatContext(ExplainOptionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterExplainFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitExplainFormat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitExplainFormat(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ExplainTypeContext extends ExplainOptionContext {
		public Token value;
		public TerminalNode TYPE() { return getToken(SqlBaseParser.TYPE, 0); }
		public TerminalNode LOGICAL() { return getToken(SqlBaseParser.LOGICAL, 0); }
		public TerminalNode DISTRIBUTED() { return getToken(SqlBaseParser.DISTRIBUTED, 0); }
		public ExplainTypeContext(ExplainOptionContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterExplainType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitExplainType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitExplainType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExplainOptionContext explainOption() throws RecognitionException {
		ExplainOptionContext _localctx = new ExplainOptionContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_explainOption);
		int _la;
		try {
			setState(1280);
			switch (_input.LA(1)) {
			case FORMAT:
				_localctx = new ExplainFormatContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1276);
				match(FORMAT);
				setState(1277);
				((ExplainFormatContext)_localctx).value = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==TEXT || _la==GRAPHVIZ) ) {
					((ExplainFormatContext)_localctx).value = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			case TYPE:
				_localctx = new ExplainTypeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1278);
				match(TYPE);
				setState(1279);
				((ExplainTypeContext)_localctx).value = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==LOGICAL || _la==DISTRIBUTED) ) {
					((ExplainTypeContext)_localctx).value = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TransactionModeContext extends ParserRuleContext {
		public TransactionModeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transactionMode; }
	 
		public TransactionModeContext() { }
		public void copyFrom(TransactionModeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TransactionAccessModeContext extends TransactionModeContext {
		public Token accessMode;
		public TerminalNode READ() { return getToken(SqlBaseParser.READ, 0); }
		public TerminalNode ONLY() { return getToken(SqlBaseParser.ONLY, 0); }
		public TerminalNode WRITE() { return getToken(SqlBaseParser.WRITE, 0); }
		public TransactionAccessModeContext(TransactionModeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterTransactionAccessMode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitTransactionAccessMode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitTransactionAccessMode(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IsolationLevelContext extends TransactionModeContext {
		public TerminalNode ISOLATION() { return getToken(SqlBaseParser.ISOLATION, 0); }
		public TerminalNode LEVEL() { return getToken(SqlBaseParser.LEVEL, 0); }
		public LevelOfIsolationContext levelOfIsolation() {
			return getRuleContext(LevelOfIsolationContext.class,0);
		}
		public IsolationLevelContext(TransactionModeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIsolationLevel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIsolationLevel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIsolationLevel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransactionModeContext transactionMode() throws RecognitionException {
		TransactionModeContext _localctx = new TransactionModeContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_transactionMode);
		int _la;
		try {
			setState(1287);
			switch (_input.LA(1)) {
			case ISOLATION:
				_localctx = new IsolationLevelContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1282);
				match(ISOLATION);
				setState(1283);
				match(LEVEL);
				setState(1284);
				levelOfIsolation();
				}
				break;
			case READ:
				_localctx = new TransactionAccessModeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1285);
				match(READ);
				setState(1286);
				((TransactionAccessModeContext)_localctx).accessMode = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==WRITE || _la==ONLY) ) {
					((TransactionAccessModeContext)_localctx).accessMode = (Token)_errHandler.recoverInline(this);
				} else {
					consume();
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LevelOfIsolationContext extends ParserRuleContext {
		public LevelOfIsolationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_levelOfIsolation; }
	 
		public LevelOfIsolationContext() { }
		public void copyFrom(LevelOfIsolationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ReadUncommittedContext extends LevelOfIsolationContext {
		public TerminalNode READ() { return getToken(SqlBaseParser.READ, 0); }
		public TerminalNode UNCOMMITTED() { return getToken(SqlBaseParser.UNCOMMITTED, 0); }
		public ReadUncommittedContext(LevelOfIsolationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterReadUncommitted(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitReadUncommitted(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitReadUncommitted(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class SerializableContext extends LevelOfIsolationContext {
		public TerminalNode SERIALIZABLE() { return getToken(SqlBaseParser.SERIALIZABLE, 0); }
		public SerializableContext(LevelOfIsolationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterSerializable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitSerializable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitSerializable(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class ReadCommittedContext extends LevelOfIsolationContext {
		public TerminalNode READ() { return getToken(SqlBaseParser.READ, 0); }
		public TerminalNode COMMITTED() { return getToken(SqlBaseParser.COMMITTED, 0); }
		public ReadCommittedContext(LevelOfIsolationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterReadCommitted(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitReadCommitted(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitReadCommitted(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class RepeatableReadContext extends LevelOfIsolationContext {
		public TerminalNode REPEATABLE() { return getToken(SqlBaseParser.REPEATABLE, 0); }
		public TerminalNode READ() { return getToken(SqlBaseParser.READ, 0); }
		public RepeatableReadContext(LevelOfIsolationContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterRepeatableRead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitRepeatableRead(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitRepeatableRead(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LevelOfIsolationContext levelOfIsolation() throws RecognitionException {
		LevelOfIsolationContext _localctx = new LevelOfIsolationContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_levelOfIsolation);
		try {
			setState(1296);
			switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
			case 1:
				_localctx = new ReadUncommittedContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1289);
				match(READ);
				setState(1290);
				match(UNCOMMITTED);
				}
				break;
			case 2:
				_localctx = new ReadCommittedContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1291);
				match(READ);
				setState(1292);
				match(COMMITTED);
				}
				break;
			case 3:
				_localctx = new RepeatableReadContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1293);
				match(REPEATABLE);
				setState(1294);
				match(READ);
				}
				break;
			case 4:
				_localctx = new SerializableContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1295);
				match(SERIALIZABLE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CallArgumentContext extends ParserRuleContext {
		public CallArgumentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_callArgument; }
	 
		public CallArgumentContext() { }
		public void copyFrom(CallArgumentContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class PositionalArgumentContext extends CallArgumentContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PositionalArgumentContext(CallArgumentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPositionalArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPositionalArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPositionalArgument(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class NamedArgumentContext extends CallArgumentContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public NamedArgumentContext(CallArgumentContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNamedArgument(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNamedArgument(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNamedArgument(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CallArgumentContext callArgument() throws RecognitionException {
		CallArgumentContext _localctx = new CallArgumentContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_callArgument);
		try {
			setState(1303);
			switch ( getInterpreter().adaptivePredict(_input,159,_ctx) ) {
			case 1:
				_localctx = new PositionalArgumentContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1298);
				expression();
				}
				break;
			case 2:
				_localctx = new NamedArgumentContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1299);
				identifier();
				setState(1300);
				match(T__7);
				setState(1301);
				expression();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrivilegeContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(SqlBaseParser.SELECT, 0); }
		public TerminalNode DELETE() { return getToken(SqlBaseParser.DELETE, 0); }
		public TerminalNode INSERT() { return getToken(SqlBaseParser.INSERT, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public PrivilegeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_privilege; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterPrivilege(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitPrivilege(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitPrivilege(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrivilegeContext privilege() throws RecognitionException {
		PrivilegeContext _localctx = new PrivilegeContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_privilege);
		try {
			setState(1309);
			switch (_input.LA(1)) {
			case SELECT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1305);
				match(SELECT);
				}
				break;
			case DELETE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1306);
				match(DELETE);
				}
				break;
			case INSERT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1307);
				match(INSERT);
				}
				break;
			case ADD:
			case APPROXIMATE:
			case AT:
			case CONFIDENCE:
			case NO:
			case SUBSTRING:
			case POSITION:
			case TINYINT:
			case SMALLINT:
			case INTEGER:
			case DATE:
			case TIME:
			case TIMESTAMP:
			case INTERVAL:
			case YEAR:
			case MONTH:
			case DAY:
			case HOUR:
			case MINUTE:
			case SECOND:
			case ZONE:
			case OVER:
			case PARTITION:
			case RANGE:
			case ROWS:
			case PRECEDING:
			case FOLLOWING:
			case CURRENT:
			case ROW:
			case VIEW:
			case REPLACE:
			case GRANT:
			case REVOKE:
			case PRIVILEGES:
			case PUBLIC:
			case OPTION:
			case EXPLAIN:
			case ANALYZE:
			case FORMAT:
			case TYPE:
			case TEXT:
			case GRAPHVIZ:
			case LOGICAL:
			case DISTRIBUTED:
			case TRY:
			case SHOW:
			case TABLES:
			case SCHEMAS:
			case CATALOGS:
			case COLUMNS:
			case COLUMN:
			case USE:
			case PARTITIONS:
			case FUNCTIONS:
			case TO:
			case SYSTEM:
			case BERNOULLI:
			case POISSONIZED:
			case TABLESAMPLE:
			case RESCALED:
			case ARRAY:
			case MAP:
			case SET:
			case RESET:
			case SESSION:
			case DATA:
			case START:
			case TRANSACTION:
			case COMMIT:
			case ROLLBACK:
			case WORK:
			case ISOLATION:
			case LEVEL:
			case SERIALIZABLE:
			case REPEATABLE:
			case COMMITTED:
			case UNCOMMITTED:
			case READ:
			case WRITE:
			case ONLY:
			case CALL:
			case NFD:
			case NFC:
			case NFKD:
			case NFKC:
			case IF:
			case NULLIF:
			case COALESCE:
			case IDENTIFIER:
			case DIGIT_IDENTIFIER:
			case QUOTED_IDENTIFIER:
			case BACKQUOTED_IDENTIFIER:
				enterOuterAlt(_localctx, 4);
				{
				setState(1308);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QualifiedNameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public QualifiedNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_qualifiedName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQualifiedName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQualifiedName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQualifiedName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QualifiedNameContext qualifiedName() throws RecognitionException {
		QualifiedNameContext _localctx = new QualifiedNameContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_qualifiedName);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1311);
			identifier();
			setState(1316);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,161,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(1312);
					match(T__0);
					setState(1313);
					identifier();
					}
					} 
				}
				setState(1318);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,161,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdentifierContext extends ParserRuleContext {
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
	 
		public IdentifierContext() { }
		public void copyFrom(IdentifierContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class BackQuotedIdentifierContext extends IdentifierContext {
		public TerminalNode BACKQUOTED_IDENTIFIER() { return getToken(SqlBaseParser.BACKQUOTED_IDENTIFIER, 0); }
		public BackQuotedIdentifierContext(IdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterBackQuotedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitBackQuotedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitBackQuotedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class QuotedIdentifierAlternativeContext extends IdentifierContext {
		public QuotedIdentifierContext quotedIdentifier() {
			return getRuleContext(QuotedIdentifierContext.class,0);
		}
		public QuotedIdentifierAlternativeContext(IdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQuotedIdentifierAlternative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQuotedIdentifierAlternative(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQuotedIdentifierAlternative(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class DigitIdentifierContext extends IdentifierContext {
		public TerminalNode DIGIT_IDENTIFIER() { return getToken(SqlBaseParser.DIGIT_IDENTIFIER, 0); }
		public DigitIdentifierContext(IdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDigitIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDigitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDigitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnquotedIdentifierContext extends IdentifierContext {
		public TerminalNode IDENTIFIER() { return getToken(SqlBaseParser.IDENTIFIER, 0); }
		public NonReservedContext nonReserved() {
			return getRuleContext(NonReservedContext.class,0);
		}
		public UnquotedIdentifierContext(IdentifierContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterUnquotedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitUnquotedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitUnquotedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_identifier);
		try {
			setState(1324);
			switch (_input.LA(1)) {
			case IDENTIFIER:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1319);
				match(IDENTIFIER);
				}
				break;
			case QUOTED_IDENTIFIER:
				_localctx = new QuotedIdentifierAlternativeContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1320);
				quotedIdentifier();
				}
				break;
			case ADD:
			case APPROXIMATE:
			case AT:
			case CONFIDENCE:
			case NO:
			case SUBSTRING:
			case POSITION:
			case TINYINT:
			case SMALLINT:
			case INTEGER:
			case DATE:
			case TIME:
			case TIMESTAMP:
			case INTERVAL:
			case YEAR:
			case MONTH:
			case DAY:
			case HOUR:
			case MINUTE:
			case SECOND:
			case ZONE:
			case OVER:
			case PARTITION:
			case RANGE:
			case ROWS:
			case PRECEDING:
			case FOLLOWING:
			case CURRENT:
			case ROW:
			case VIEW:
			case REPLACE:
			case GRANT:
			case REVOKE:
			case PRIVILEGES:
			case PUBLIC:
			case OPTION:
			case EXPLAIN:
			case ANALYZE:
			case FORMAT:
			case TYPE:
			case TEXT:
			case GRAPHVIZ:
			case LOGICAL:
			case DISTRIBUTED:
			case TRY:
			case SHOW:
			case TABLES:
			case SCHEMAS:
			case CATALOGS:
			case COLUMNS:
			case COLUMN:
			case USE:
			case PARTITIONS:
			case FUNCTIONS:
			case TO:
			case SYSTEM:
			case BERNOULLI:
			case POISSONIZED:
			case TABLESAMPLE:
			case RESCALED:
			case ARRAY:
			case MAP:
			case SET:
			case RESET:
			case SESSION:
			case DATA:
			case START:
			case TRANSACTION:
			case COMMIT:
			case ROLLBACK:
			case WORK:
			case ISOLATION:
			case LEVEL:
			case SERIALIZABLE:
			case REPEATABLE:
			case COMMITTED:
			case UNCOMMITTED:
			case READ:
			case WRITE:
			case ONLY:
			case CALL:
			case NFD:
			case NFC:
			case NFKD:
			case NFKC:
			case IF:
			case NULLIF:
			case COALESCE:
				_localctx = new UnquotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(1321);
				nonReserved();
				}
				break;
			case BACKQUOTED_IDENTIFIER:
				_localctx = new BackQuotedIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(1322);
				match(BACKQUOTED_IDENTIFIER);
				}
				break;
			case DIGIT_IDENTIFIER:
				_localctx = new DigitIdentifierContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(1323);
				match(DIGIT_IDENTIFIER);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QuotedIdentifierContext extends ParserRuleContext {
		public TerminalNode QUOTED_IDENTIFIER() { return getToken(SqlBaseParser.QUOTED_IDENTIFIER, 0); }
		public QuotedIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_quotedIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterQuotedIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitQuotedIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitQuotedIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QuotedIdentifierContext quotedIdentifier() throws RecognitionException {
		QuotedIdentifierContext _localctx = new QuotedIdentifierContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_quotedIdentifier);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1326);
			match(QUOTED_IDENTIFIER);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NumberContext extends ParserRuleContext {
		public NumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_number; }
	 
		public NumberContext() { }
		public void copyFrom(NumberContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class DecimalLiteralContext extends NumberContext {
		public TerminalNode DECIMAL_VALUE() { return getToken(SqlBaseParser.DECIMAL_VALUE, 0); }
		public DecimalLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterDecimalLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitDecimalLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitDecimalLiteral(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IntegerLiteralContext extends NumberContext {
		public TerminalNode INTEGER_VALUE() { return getToken(SqlBaseParser.INTEGER_VALUE, 0); }
		public IntegerLiteralContext(NumberContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterIntegerLiteral(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitIntegerLiteral(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitIntegerLiteral(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberContext number() throws RecognitionException {
		NumberContext _localctx = new NumberContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_number);
		try {
			setState(1330);
			switch (_input.LA(1)) {
			case DECIMAL_VALUE:
				_localctx = new DecimalLiteralContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(1328);
				match(DECIMAL_VALUE);
				}
				break;
			case INTEGER_VALUE:
				_localctx = new IntegerLiteralContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(1329);
				match(INTEGER_VALUE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NonReservedContext extends ParserRuleContext {
		public TerminalNode SHOW() { return getToken(SqlBaseParser.SHOW, 0); }
		public TerminalNode TABLES() { return getToken(SqlBaseParser.TABLES, 0); }
		public TerminalNode COLUMNS() { return getToken(SqlBaseParser.COLUMNS, 0); }
		public TerminalNode COLUMN() { return getToken(SqlBaseParser.COLUMN, 0); }
		public TerminalNode PARTITIONS() { return getToken(SqlBaseParser.PARTITIONS, 0); }
		public TerminalNode FUNCTIONS() { return getToken(SqlBaseParser.FUNCTIONS, 0); }
		public TerminalNode SCHEMAS() { return getToken(SqlBaseParser.SCHEMAS, 0); }
		public TerminalNode CATALOGS() { return getToken(SqlBaseParser.CATALOGS, 0); }
		public TerminalNode SESSION() { return getToken(SqlBaseParser.SESSION, 0); }
		public TerminalNode ADD() { return getToken(SqlBaseParser.ADD, 0); }
		public TerminalNode OVER() { return getToken(SqlBaseParser.OVER, 0); }
		public TerminalNode PARTITION() { return getToken(SqlBaseParser.PARTITION, 0); }
		public TerminalNode RANGE() { return getToken(SqlBaseParser.RANGE, 0); }
		public TerminalNode ROWS() { return getToken(SqlBaseParser.ROWS, 0); }
		public TerminalNode PRECEDING() { return getToken(SqlBaseParser.PRECEDING, 0); }
		public TerminalNode FOLLOWING() { return getToken(SqlBaseParser.FOLLOWING, 0); }
		public TerminalNode CURRENT() { return getToken(SqlBaseParser.CURRENT, 0); }
		public TerminalNode ROW() { return getToken(SqlBaseParser.ROW, 0); }
		public TerminalNode MAP() { return getToken(SqlBaseParser.MAP, 0); }
		public TerminalNode ARRAY() { return getToken(SqlBaseParser.ARRAY, 0); }
		public TerminalNode TINYINT() { return getToken(SqlBaseParser.TINYINT, 0); }
		public TerminalNode SMALLINT() { return getToken(SqlBaseParser.SMALLINT, 0); }
		public TerminalNode INTEGER() { return getToken(SqlBaseParser.INTEGER, 0); }
		public TerminalNode DATE() { return getToken(SqlBaseParser.DATE, 0); }
		public TerminalNode TIME() { return getToken(SqlBaseParser.TIME, 0); }
		public TerminalNode TIMESTAMP() { return getToken(SqlBaseParser.TIMESTAMP, 0); }
		public TerminalNode INTERVAL() { return getToken(SqlBaseParser.INTERVAL, 0); }
		public TerminalNode ZONE() { return getToken(SqlBaseParser.ZONE, 0); }
		public TerminalNode YEAR() { return getToken(SqlBaseParser.YEAR, 0); }
		public TerminalNode MONTH() { return getToken(SqlBaseParser.MONTH, 0); }
		public TerminalNode DAY() { return getToken(SqlBaseParser.DAY, 0); }
		public TerminalNode HOUR() { return getToken(SqlBaseParser.HOUR, 0); }
		public TerminalNode MINUTE() { return getToken(SqlBaseParser.MINUTE, 0); }
		public TerminalNode SECOND() { return getToken(SqlBaseParser.SECOND, 0); }
		public TerminalNode EXPLAIN() { return getToken(SqlBaseParser.EXPLAIN, 0); }
		public TerminalNode ANALYZE() { return getToken(SqlBaseParser.ANALYZE, 0); }
		public TerminalNode FORMAT() { return getToken(SqlBaseParser.FORMAT, 0); }
		public TerminalNode TYPE() { return getToken(SqlBaseParser.TYPE, 0); }
		public TerminalNode TEXT() { return getToken(SqlBaseParser.TEXT, 0); }
		public TerminalNode GRAPHVIZ() { return getToken(SqlBaseParser.GRAPHVIZ, 0); }
		public TerminalNode LOGICAL() { return getToken(SqlBaseParser.LOGICAL, 0); }
		public TerminalNode DISTRIBUTED() { return getToken(SqlBaseParser.DISTRIBUTED, 0); }
		public TerminalNode TABLESAMPLE() { return getToken(SqlBaseParser.TABLESAMPLE, 0); }
		public TerminalNode SYSTEM() { return getToken(SqlBaseParser.SYSTEM, 0); }
		public TerminalNode BERNOULLI() { return getToken(SqlBaseParser.BERNOULLI, 0); }
		public TerminalNode POISSONIZED() { return getToken(SqlBaseParser.POISSONIZED, 0); }
		public TerminalNode USE() { return getToken(SqlBaseParser.USE, 0); }
		public TerminalNode TO() { return getToken(SqlBaseParser.TO, 0); }
		public TerminalNode RESCALED() { return getToken(SqlBaseParser.RESCALED, 0); }
		public TerminalNode APPROXIMATE() { return getToken(SqlBaseParser.APPROXIMATE, 0); }
		public TerminalNode AT() { return getToken(SqlBaseParser.AT, 0); }
		public TerminalNode CONFIDENCE() { return getToken(SqlBaseParser.CONFIDENCE, 0); }
		public TerminalNode SET() { return getToken(SqlBaseParser.SET, 0); }
		public TerminalNode RESET() { return getToken(SqlBaseParser.RESET, 0); }
		public TerminalNode VIEW() { return getToken(SqlBaseParser.VIEW, 0); }
		public TerminalNode REPLACE() { return getToken(SqlBaseParser.REPLACE, 0); }
		public TerminalNode IF() { return getToken(SqlBaseParser.IF, 0); }
		public TerminalNode NULLIF() { return getToken(SqlBaseParser.NULLIF, 0); }
		public TerminalNode COALESCE() { return getToken(SqlBaseParser.COALESCE, 0); }
		public TerminalNode TRY() { return getToken(SqlBaseParser.TRY, 0); }
		public NormalFormContext normalForm() {
			return getRuleContext(NormalFormContext.class,0);
		}
		public TerminalNode POSITION() { return getToken(SqlBaseParser.POSITION, 0); }
		public TerminalNode NO() { return getToken(SqlBaseParser.NO, 0); }
		public TerminalNode DATA() { return getToken(SqlBaseParser.DATA, 0); }
		public TerminalNode START() { return getToken(SqlBaseParser.START, 0); }
		public TerminalNode TRANSACTION() { return getToken(SqlBaseParser.TRANSACTION, 0); }
		public TerminalNode COMMIT() { return getToken(SqlBaseParser.COMMIT, 0); }
		public TerminalNode ROLLBACK() { return getToken(SqlBaseParser.ROLLBACK, 0); }
		public TerminalNode WORK() { return getToken(SqlBaseParser.WORK, 0); }
		public TerminalNode ISOLATION() { return getToken(SqlBaseParser.ISOLATION, 0); }
		public TerminalNode LEVEL() { return getToken(SqlBaseParser.LEVEL, 0); }
		public TerminalNode SERIALIZABLE() { return getToken(SqlBaseParser.SERIALIZABLE, 0); }
		public TerminalNode REPEATABLE() { return getToken(SqlBaseParser.REPEATABLE, 0); }
		public TerminalNode COMMITTED() { return getToken(SqlBaseParser.COMMITTED, 0); }
		public TerminalNode UNCOMMITTED() { return getToken(SqlBaseParser.UNCOMMITTED, 0); }
		public TerminalNode READ() { return getToken(SqlBaseParser.READ, 0); }
		public TerminalNode WRITE() { return getToken(SqlBaseParser.WRITE, 0); }
		public TerminalNode ONLY() { return getToken(SqlBaseParser.ONLY, 0); }
		public TerminalNode CALL() { return getToken(SqlBaseParser.CALL, 0); }
		public TerminalNode GRANT() { return getToken(SqlBaseParser.GRANT, 0); }
		public TerminalNode REVOKE() { return getToken(SqlBaseParser.REVOKE, 0); }
		public TerminalNode PRIVILEGES() { return getToken(SqlBaseParser.PRIVILEGES, 0); }
		public TerminalNode PUBLIC() { return getToken(SqlBaseParser.PUBLIC, 0); }
		public TerminalNode OPTION() { return getToken(SqlBaseParser.OPTION, 0); }
		public TerminalNode SUBSTRING() { return getToken(SqlBaseParser.SUBSTRING, 0); }
		public NonReservedContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nonReserved; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNonReserved(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNonReserved(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNonReserved(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NonReservedContext nonReserved() throws RecognitionException {
		NonReservedContext _localctx = new NonReservedContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_nonReserved);
		try {
			setState(1417);
			switch (_input.LA(1)) {
			case SHOW:
				enterOuterAlt(_localctx, 1);
				{
				setState(1332);
				match(SHOW);
				}
				break;
			case TABLES:
				enterOuterAlt(_localctx, 2);
				{
				setState(1333);
				match(TABLES);
				}
				break;
			case COLUMNS:
				enterOuterAlt(_localctx, 3);
				{
				setState(1334);
				match(COLUMNS);
				}
				break;
			case COLUMN:
				enterOuterAlt(_localctx, 4);
				{
				setState(1335);
				match(COLUMN);
				}
				break;
			case PARTITIONS:
				enterOuterAlt(_localctx, 5);
				{
				setState(1336);
				match(PARTITIONS);
				}
				break;
			case FUNCTIONS:
				enterOuterAlt(_localctx, 6);
				{
				setState(1337);
				match(FUNCTIONS);
				}
				break;
			case SCHEMAS:
				enterOuterAlt(_localctx, 7);
				{
				setState(1338);
				match(SCHEMAS);
				}
				break;
			case CATALOGS:
				enterOuterAlt(_localctx, 8);
				{
				setState(1339);
				match(CATALOGS);
				}
				break;
			case SESSION:
				enterOuterAlt(_localctx, 9);
				{
				setState(1340);
				match(SESSION);
				}
				break;
			case ADD:
				enterOuterAlt(_localctx, 10);
				{
				setState(1341);
				match(ADD);
				}
				break;
			case OVER:
				enterOuterAlt(_localctx, 11);
				{
				setState(1342);
				match(OVER);
				}
				break;
			case PARTITION:
				enterOuterAlt(_localctx, 12);
				{
				setState(1343);
				match(PARTITION);
				}
				break;
			case RANGE:
				enterOuterAlt(_localctx, 13);
				{
				setState(1344);
				match(RANGE);
				}
				break;
			case ROWS:
				enterOuterAlt(_localctx, 14);
				{
				setState(1345);
				match(ROWS);
				}
				break;
			case PRECEDING:
				enterOuterAlt(_localctx, 15);
				{
				setState(1346);
				match(PRECEDING);
				}
				break;
			case FOLLOWING:
				enterOuterAlt(_localctx, 16);
				{
				setState(1347);
				match(FOLLOWING);
				}
				break;
			case CURRENT:
				enterOuterAlt(_localctx, 17);
				{
				setState(1348);
				match(CURRENT);
				}
				break;
			case ROW:
				enterOuterAlt(_localctx, 18);
				{
				setState(1349);
				match(ROW);
				}
				break;
			case MAP:
				enterOuterAlt(_localctx, 19);
				{
				setState(1350);
				match(MAP);
				}
				break;
			case ARRAY:
				enterOuterAlt(_localctx, 20);
				{
				setState(1351);
				match(ARRAY);
				}
				break;
			case TINYINT:
				enterOuterAlt(_localctx, 21);
				{
				setState(1352);
				match(TINYINT);
				}
				break;
			case SMALLINT:
				enterOuterAlt(_localctx, 22);
				{
				setState(1353);
				match(SMALLINT);
				}
				break;
			case INTEGER:
				enterOuterAlt(_localctx, 23);
				{
				setState(1354);
				match(INTEGER);
				}
				break;
			case DATE:
				enterOuterAlt(_localctx, 24);
				{
				setState(1355);
				match(DATE);
				}
				break;
			case TIME:
				enterOuterAlt(_localctx, 25);
				{
				setState(1356);
				match(TIME);
				}
				break;
			case TIMESTAMP:
				enterOuterAlt(_localctx, 26);
				{
				setState(1357);
				match(TIMESTAMP);
				}
				break;
			case INTERVAL:
				enterOuterAlt(_localctx, 27);
				{
				setState(1358);
				match(INTERVAL);
				}
				break;
			case ZONE:
				enterOuterAlt(_localctx, 28);
				{
				setState(1359);
				match(ZONE);
				}
				break;
			case YEAR:
				enterOuterAlt(_localctx, 29);
				{
				setState(1360);
				match(YEAR);
				}
				break;
			case MONTH:
				enterOuterAlt(_localctx, 30);
				{
				setState(1361);
				match(MONTH);
				}
				break;
			case DAY:
				enterOuterAlt(_localctx, 31);
				{
				setState(1362);
				match(DAY);
				}
				break;
			case HOUR:
				enterOuterAlt(_localctx, 32);
				{
				setState(1363);
				match(HOUR);
				}
				break;
			case MINUTE:
				enterOuterAlt(_localctx, 33);
				{
				setState(1364);
				match(MINUTE);
				}
				break;
			case SECOND:
				enterOuterAlt(_localctx, 34);
				{
				setState(1365);
				match(SECOND);
				}
				break;
			case EXPLAIN:
				enterOuterAlt(_localctx, 35);
				{
				setState(1366);
				match(EXPLAIN);
				}
				break;
			case ANALYZE:
				enterOuterAlt(_localctx, 36);
				{
				setState(1367);
				match(ANALYZE);
				}
				break;
			case FORMAT:
				enterOuterAlt(_localctx, 37);
				{
				setState(1368);
				match(FORMAT);
				}
				break;
			case TYPE:
				enterOuterAlt(_localctx, 38);
				{
				setState(1369);
				match(TYPE);
				}
				break;
			case TEXT:
				enterOuterAlt(_localctx, 39);
				{
				setState(1370);
				match(TEXT);
				}
				break;
			case GRAPHVIZ:
				enterOuterAlt(_localctx, 40);
				{
				setState(1371);
				match(GRAPHVIZ);
				}
				break;
			case LOGICAL:
				enterOuterAlt(_localctx, 41);
				{
				setState(1372);
				match(LOGICAL);
				}
				break;
			case DISTRIBUTED:
				enterOuterAlt(_localctx, 42);
				{
				setState(1373);
				match(DISTRIBUTED);
				}
				break;
			case TABLESAMPLE:
				enterOuterAlt(_localctx, 43);
				{
				setState(1374);
				match(TABLESAMPLE);
				}
				break;
			case SYSTEM:
				enterOuterAlt(_localctx, 44);
				{
				setState(1375);
				match(SYSTEM);
				}
				break;
			case BERNOULLI:
				enterOuterAlt(_localctx, 45);
				{
				setState(1376);
				match(BERNOULLI);
				}
				break;
			case POISSONIZED:
				enterOuterAlt(_localctx, 46);
				{
				setState(1377);
				match(POISSONIZED);
				}
				break;
			case USE:
				enterOuterAlt(_localctx, 47);
				{
				setState(1378);
				match(USE);
				}
				break;
			case TO:
				enterOuterAlt(_localctx, 48);
				{
				setState(1379);
				match(TO);
				}
				break;
			case RESCALED:
				enterOuterAlt(_localctx, 49);
				{
				setState(1380);
				match(RESCALED);
				}
				break;
			case APPROXIMATE:
				enterOuterAlt(_localctx, 50);
				{
				setState(1381);
				match(APPROXIMATE);
				}
				break;
			case AT:
				enterOuterAlt(_localctx, 51);
				{
				setState(1382);
				match(AT);
				}
				break;
			case CONFIDENCE:
				enterOuterAlt(_localctx, 52);
				{
				setState(1383);
				match(CONFIDENCE);
				}
				break;
			case SET:
				enterOuterAlt(_localctx, 53);
				{
				setState(1384);
				match(SET);
				}
				break;
			case RESET:
				enterOuterAlt(_localctx, 54);
				{
				setState(1385);
				match(RESET);
				}
				break;
			case VIEW:
				enterOuterAlt(_localctx, 55);
				{
				setState(1386);
				match(VIEW);
				}
				break;
			case REPLACE:
				enterOuterAlt(_localctx, 56);
				{
				setState(1387);
				match(REPLACE);
				}
				break;
			case IF:
				enterOuterAlt(_localctx, 57);
				{
				setState(1388);
				match(IF);
				}
				break;
			case NULLIF:
				enterOuterAlt(_localctx, 58);
				{
				setState(1389);
				match(NULLIF);
				}
				break;
			case COALESCE:
				enterOuterAlt(_localctx, 59);
				{
				setState(1390);
				match(COALESCE);
				}
				break;
			case TRY:
				enterOuterAlt(_localctx, 60);
				{
				setState(1391);
				match(TRY);
				}
				break;
			case NFD:
			case NFC:
			case NFKD:
			case NFKC:
				enterOuterAlt(_localctx, 61);
				{
				setState(1392);
				normalForm();
				}
				break;
			case POSITION:
				enterOuterAlt(_localctx, 62);
				{
				setState(1393);
				match(POSITION);
				}
				break;
			case NO:
				enterOuterAlt(_localctx, 63);
				{
				setState(1394);
				match(NO);
				}
				break;
			case DATA:
				enterOuterAlt(_localctx, 64);
				{
				setState(1395);
				match(DATA);
				}
				break;
			case START:
				enterOuterAlt(_localctx, 65);
				{
				setState(1396);
				match(START);
				}
				break;
			case TRANSACTION:
				enterOuterAlt(_localctx, 66);
				{
				setState(1397);
				match(TRANSACTION);
				}
				break;
			case COMMIT:
				enterOuterAlt(_localctx, 67);
				{
				setState(1398);
				match(COMMIT);
				}
				break;
			case ROLLBACK:
				enterOuterAlt(_localctx, 68);
				{
				setState(1399);
				match(ROLLBACK);
				}
				break;
			case WORK:
				enterOuterAlt(_localctx, 69);
				{
				setState(1400);
				match(WORK);
				}
				break;
			case ISOLATION:
				enterOuterAlt(_localctx, 70);
				{
				setState(1401);
				match(ISOLATION);
				}
				break;
			case LEVEL:
				enterOuterAlt(_localctx, 71);
				{
				setState(1402);
				match(LEVEL);
				}
				break;
			case SERIALIZABLE:
				enterOuterAlt(_localctx, 72);
				{
				setState(1403);
				match(SERIALIZABLE);
				}
				break;
			case REPEATABLE:
				enterOuterAlt(_localctx, 73);
				{
				setState(1404);
				match(REPEATABLE);
				}
				break;
			case COMMITTED:
				enterOuterAlt(_localctx, 74);
				{
				setState(1405);
				match(COMMITTED);
				}
				break;
			case UNCOMMITTED:
				enterOuterAlt(_localctx, 75);
				{
				setState(1406);
				match(UNCOMMITTED);
				}
				break;
			case READ:
				enterOuterAlt(_localctx, 76);
				{
				setState(1407);
				match(READ);
				}
				break;
			case WRITE:
				enterOuterAlt(_localctx, 77);
				{
				setState(1408);
				match(WRITE);
				}
				break;
			case ONLY:
				enterOuterAlt(_localctx, 78);
				{
				setState(1409);
				match(ONLY);
				}
				break;
			case CALL:
				enterOuterAlt(_localctx, 79);
				{
				setState(1410);
				match(CALL);
				}
				break;
			case GRANT:
				enterOuterAlt(_localctx, 80);
				{
				setState(1411);
				match(GRANT);
				}
				break;
			case REVOKE:
				enterOuterAlt(_localctx, 81);
				{
				setState(1412);
				match(REVOKE);
				}
				break;
			case PRIVILEGES:
				enterOuterAlt(_localctx, 82);
				{
				setState(1413);
				match(PRIVILEGES);
				}
				break;
			case PUBLIC:
				enterOuterAlt(_localctx, 83);
				{
				setState(1414);
				match(PUBLIC);
				}
				break;
			case OPTION:
				enterOuterAlt(_localctx, 84);
				{
				setState(1415);
				match(OPTION);
				}
				break;
			case SUBSTRING:
				enterOuterAlt(_localctx, 85);
				{
				setState(1416);
				match(SUBSTRING);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NormalFormContext extends ParserRuleContext {
		public TerminalNode NFD() { return getToken(SqlBaseParser.NFD, 0); }
		public TerminalNode NFC() { return getToken(SqlBaseParser.NFC, 0); }
		public TerminalNode NFKD() { return getToken(SqlBaseParser.NFKD, 0); }
		public TerminalNode NFKC() { return getToken(SqlBaseParser.NFKC, 0); }
		public NormalFormContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_normalForm; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).enterNormalForm(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SqlBaseListener ) ((SqlBaseListener)listener).exitNormalForm(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SqlBaseVisitor ) return ((SqlBaseVisitor<? extends T>)visitor).visitNormalForm(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NormalFormContext normalForm() throws RecognitionException {
		NormalFormContext _localctx = new NormalFormContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_normalForm);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1419);
			_la = _input.LA(1);
			if ( !(((((_la - 172)) & ~0x3f) == 0 && ((1L << (_la - 172)) & ((1L << (NFD - 172)) | (1L << (NFC - 172)) | (1L << (NFKD - 172)) | (1L << (NFKC - 172)))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 9:
			return queryTerm_sempred((QueryTermContext)_localctx, predIndex);
		case 20:
			return relation_sempred((RelationContext)_localctx, predIndex);
		case 29:
			return booleanExpression_sempred((BooleanExpressionContext)_localctx, predIndex);
		case 32:
			return valueExpression_sempred((ValueExpressionContext)_localctx, predIndex);
		case 33:
			return primaryExpression_sempred((PrimaryExpressionContext)_localctx, predIndex);
		case 39:
			return type_sempred((TypeContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean queryTerm_sempred(QueryTermContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 2);
		case 1:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean relation_sempred(RelationContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean booleanExpression_sempred(BooleanExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 3);
		case 4:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean valueExpression_sempred(ValueExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 5:
			return precpred(_ctx, 3);
		case 6:
			return precpred(_ctx, 2);
		case 7:
			return precpred(_ctx, 1);
		case 8:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean primaryExpression_sempred(PrimaryExpressionContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 12);
		case 10:
			return precpred(_ctx, 10);
		}
		return true;
	}
	private boolean type_sempred(TypeContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return precpred(_ctx, 5);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\u00cf\u0590\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\3\2\3\2\3\2\3\3\3"+
		"\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0088\n"+
		"\4\3\4\3\4\3\4\5\4\u008d\n\4\3\4\3\4\3\4\3\4\5\4\u0093\n\4\3\4\5\4\u0096"+
		"\n\4\3\4\3\4\3\4\3\4\3\4\5\4\u009d\n\4\3\4\3\4\3\4\3\4\3\4\7\4\u00a4\n"+
		"\4\f\4\16\4\u00a7\13\4\3\4\3\4\3\4\5\4\u00ac\n\4\3\4\3\4\3\4\3\4\5\4\u00b2"+
		"\n\4\3\4\3\4\3\4\3\4\3\4\5\4\u00b9\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4"+
		"\u00c2\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u00de\n\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u00e9\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4"+
		"\u00f2\n\4\f\4\16\4\u00f5\13\4\5\4\u00f7\n\4\3\4\3\4\3\4\3\4\3\4\3\4\7"+
		"\4\u00ff\n\4\f\4\16\4\u0102\13\4\3\4\3\4\5\4\u0106\n\4\3\4\3\4\5\4\u010a"+
		"\n\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0112\n\4\3\4\3\4\3\4\3\4\5\4\u0118\n"+
		"\4\3\4\3\4\3\4\7\4\u011d\n\4\f\4\16\4\u0120\13\4\3\4\3\4\5\4\u0124\n\4"+
		"\3\4\3\4\5\4\u0128\n\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0130\n\4\3\4\3\4\3"+
		"\4\3\4\7\4\u0136\n\4\f\4\16\4\u0139\13\4\3\4\3\4\5\4\u013d\n\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u014c\n\4\3\4\3\4\5\4"+
		"\u0150\n\4\3\4\3\4\3\4\3\4\5\4\u0156\n\4\3\4\3\4\5\4\u015a\n\4\3\4\3\4"+
		"\3\4\3\4\5\4\u0160\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\7\4\u017c\n\4"+
		"\f\4\16\4\u017f\13\4\5\4\u0181\n\4\3\4\3\4\5\4\u0185\n\4\3\4\3\4\5\4\u0189"+
		"\n\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u0191\n\4\3\4\3\4\3\4\3\4\3\4\7\4\u0198"+
		"\n\4\f\4\16\4\u019b\13\4\5\4\u019d\n\4\3\4\3\4\5\4\u01a1\n\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4\u01ad\n\4\3\5\5\5\u01b0\n\5\3\5\3\5"+
		"\3\6\3\6\5\6\u01b6\n\6\3\6\3\6\3\6\7\6\u01bb\n\6\f\6\16\6\u01be\13\6\3"+
		"\7\3\7\3\7\3\b\3\b\3\b\3\b\7\b\u01c7\n\b\f\b\16\b\u01ca\13\b\3\b\3\b\3"+
		"\t\3\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\7\n\u01d8\n\n\f\n\16\n\u01db\13"+
		"\n\5\n\u01dd\n\n\3\n\3\n\5\n\u01e1\n\n\3\n\3\n\3\n\3\n\3\n\5\n\u01e8\n"+
		"\n\3\13\3\13\3\13\3\13\3\13\3\13\5\13\u01f0\n\13\3\13\3\13\3\13\3\13\5"+
		"\13\u01f6\n\13\3\13\7\13\u01f9\n\13\f\13\16\13\u01fc\13\13\3\f\3\f\3\f"+
		"\3\f\3\f\3\f\3\f\7\f\u0205\n\f\f\f\16\f\u0208\13\f\3\f\3\f\3\f\3\f\5\f"+
		"\u020e\n\f\3\r\3\r\5\r\u0212\n\r\3\r\3\r\5\r\u0216\n\r\3\16\3\16\5\16"+
		"\u021a\n\16\3\16\3\16\3\16\7\16\u021f\n\16\f\16\16\16\u0222\13\16\3\16"+
		"\3\16\3\16\3\16\7\16\u0228\n\16\f\16\16\16\u022b\13\16\5\16\u022d\n\16"+
		"\3\16\3\16\5\16\u0231\n\16\3\16\3\16\3\16\5\16\u0236\n\16\3\16\3\16\5"+
		"\16\u023a\n\16\3\17\5\17\u023d\n\17\3\17\3\17\3\17\7\17\u0242\n\17\f\17"+
		"\16\17\u0245\13\17\3\20\3\20\3\20\3\20\3\20\3\20\7\20\u024d\n\20\f\20"+
		"\16\20\u0250\13\20\5\20\u0252\n\20\3\20\3\20\3\20\3\20\3\20\3\20\7\20"+
		"\u025a\n\20\f\20\16\20\u025d\13\20\5\20\u025f\n\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\7\20\u0268\n\20\f\20\16\20\u026b\13\20\3\20\3\20\5\20"+
		"\u026f\n\20\3\21\3\21\3\21\3\21\7\21\u0275\n\21\f\21\16\21\u0278\13\21"+
		"\5\21\u027a\n\21\3\21\3\21\5\21\u027e\n\21\3\22\3\22\3\22\3\22\7\22\u0284"+
		"\n\22\f\22\16\22\u0287\13\22\5\22\u0289\n\22\3\22\3\22\5\22\u028d\n\22"+
		"\3\23\3\23\5\23\u0291\n\23\3\23\3\23\3\23\3\23\3\23\3\24\3\24\3\25\3\25"+
		"\5\25\u029c\n\25\3\25\5\25\u029f\n\25\3\25\3\25\3\25\3\25\3\25\5\25\u02a6"+
		"\n\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26"+
		"\3\26\3\26\3\26\3\26\5\26\u02b9\n\26\7\26\u02bb\n\26\f\26\16\26\u02be"+
		"\13\26\3\27\5\27\u02c1\n\27\3\27\3\27\5\27\u02c5\n\27\3\27\3\27\5\27\u02c9"+
		"\n\27\3\27\3\27\5\27\u02cd\n\27\5\27\u02cf\n\27\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\30\7\30\u02d8\n\30\f\30\16\30\u02db\13\30\3\30\3\30\5\30\u02df"+
		"\n\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u02e8\n\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\7\31\u02f0\n\31\f\31\16\31\u02f3\13\31\3\31\3\31\5\31"+
		"\u02f7\n\31\5\31\u02f9\n\31\3\32\3\32\3\33\3\33\5\33\u02ff\n\33\3\33\3"+
		"\33\5\33\u0303\n\33\5\33\u0305\n\33\3\34\3\34\3\34\3\34\7\34\u030b\n\34"+
		"\f\34\16\34\u030e\13\34\3\34\3\34\3\35\3\35\3\35\3\35\3\35\3\35\3\35\3"+
		"\35\3\35\3\35\7\35\u031c\n\35\f\35\16\35\u031f\13\35\3\35\3\35\3\35\5"+
		"\35\u0324\n\35\3\35\3\35\3\35\3\35\5\35\u032a\n\35\3\36\3\36\3\37\3\37"+
		"\3\37\3\37\3\37\3\37\3\37\3\37\3\37\5\37\u0337\n\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\7\37\u033f\n\37\f\37\16\37\u0342\13\37\3 \3 \5 \u0346\n \3"+
		"!\3!\3!\3!\5!\u034c\n!\3!\3!\3!\3!\3!\3!\5!\u0354\n!\3!\3!\3!\3!\3!\7"+
		"!\u035b\n!\f!\16!\u035e\13!\3!\3!\3!\5!\u0363\n!\3!\3!\3!\3!\3!\3!\5!"+
		"\u036b\n!\3!\3!\3!\3!\5!\u0371\n!\3!\3!\5!\u0375\n!\3!\3!\3!\5!\u037a"+
		"\n!\3!\3!\3!\5!\u037f\n!\3\"\3\"\3\"\3\"\5\"\u0385\n\"\3\"\3\"\3\"\3\""+
		"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\3\"\7\"\u0393\n\"\f\"\16\"\u0396\13\"\3#"+
		"\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\6#\u03ad"+
		"\n#\r#\16#\u03ae\3#\3#\3#\3#\3#\3#\3#\7#\u03b8\n#\f#\16#\u03bb\13#\3#"+
		"\3#\3#\3#\3#\3#\3#\5#\u03c4\n#\3#\3#\3#\5#\u03c9\n#\3#\3#\3#\7#\u03ce"+
		"\n#\f#\16#\u03d1\13#\5#\u03d3\n#\3#\3#\5#\u03d7\n#\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\7#\u03e1\n#\f#\16#\u03e4\13#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\6#"+
		"\u03f1\n#\r#\16#\u03f2\3#\3#\5#\u03f7\n#\3#\3#\3#\3#\6#\u03fd\n#\r#\16"+
		"#\u03fe\3#\3#\5#\u0403\n#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3"+
		"#\3#\3#\3#\3#\3#\3#\7#\u041a\n#\f#\16#\u041d\13#\5#\u041f\n#\3#\3#\3#"+
		"\3#\3#\3#\3#\5#\u0428\n#\3#\3#\3#\3#\5#\u042e\n#\3#\3#\3#\3#\5#\u0434"+
		"\n#\3#\3#\3#\3#\5#\u043a\n#\3#\3#\3#\3#\3#\3#\3#\5#\u0443\n#\3#\3#\3#"+
		"\3#\3#\3#\3#\5#\u044c\n#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\3#\5#\u045b"+
		"\n#\3#\3#\3#\3#\3#\3#\3#\3#\7#\u0465\n#\f#\16#\u0468\13#\3$\3$\3$\3$\3"+
		"$\3$\5$\u0470\n$\3%\3%\3&\3&\3\'\3\'\5\'\u0478\n\'\3\'\3\'\3\'\3\'\5\'"+
		"\u047e\n\'\3(\3(\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3)\3"+
		")\3)\3)\3)\7)\u0497\n)\f)\16)\u049a\13)\3)\3)\3)\3)\3)\3)\3)\7)\u04a3"+
		"\n)\f)\16)\u04a6\13)\3)\3)\5)\u04aa\n)\5)\u04ac\n)\3)\3)\7)\u04b0\n)\f"+
		")\16)\u04b3\13)\3*\3*\5*\u04b7\n*\3+\3+\3+\5+\u04bc\n+\3,\3,\3,\3,\3,"+
		"\3-\3-\3-\3-\3-\3-\3-\7-\u04ca\n-\f-\16-\u04cd\13-\5-\u04cf\n-\3-\3-\3"+
		"-\3-\3-\7-\u04d6\n-\f-\16-\u04d9\13-\5-\u04db\n-\3-\5-\u04de\n-\3-\3-"+
		"\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\3.\5.\u04f2\n.\3/\3/\3/"+
		"\3/\3/\3/\3/\3/\3/\5/\u04fd\n/\3\60\3\60\3\60\3\60\5\60\u0503\n\60\3\61"+
		"\3\61\3\61\3\61\3\61\5\61\u050a\n\61\3\62\3\62\3\62\3\62\3\62\3\62\3\62"+
		"\5\62\u0513\n\62\3\63\3\63\3\63\3\63\3\63\5\63\u051a\n\63\3\64\3\64\3"+
		"\64\3\64\5\64\u0520\n\64\3\65\3\65\3\65\7\65\u0525\n\65\f\65\16\65\u0528"+
		"\13\65\3\66\3\66\3\66\3\66\3\66\5\66\u052f\n\66\3\67\3\67\38\38\58\u0535"+
		"\n8\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39"+
		"\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39"+
		"\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39"+
		"\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\39\59\u058c\n9\3:\3:"+
		"\3:\2\b\24*<BDP;\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60\62"+
		"\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnpr\2\23\4\2\f\f\"\"\4\2\17\17\u00c3"+
		"\u00c3\3\2\u0087\u0088\3\2\60\61\3\2-.\4\2\17\17\22\22\3\2\u008b\u008d"+
		"\3\2\u00bb\u00bc\3\2\u00bd\u00bf\3\2\u00b5\u00ba\3\2*+\3\2<A\3\2]^\3\2"+
		"vw\3\2xy\3\2\u00a7\u00a8\3\2\u00ae\u00b1\u06ac\2t\3\2\2\2\4w\3\2\2\2\6"+
		"\u01ac\3\2\2\2\b\u01af\3\2\2\2\n\u01b3\3\2\2\2\f\u01bf\3\2\2\2\16\u01c2"+
		"\3\2\2\2\20\u01cd\3\2\2\2\22\u01d1\3\2\2\2\24\u01e9\3\2\2\2\26\u020d\3"+
		"\2\2\2\30\u020f\3\2\2\2\32\u0217\3\2\2\2\34\u023c\3\2\2\2\36\u026e\3\2"+
		"\2\2 \u027d\3\2\2\2\"\u028c\3\2\2\2$\u028e\3\2\2\2&\u0297\3\2\2\2(\u02a5"+
		"\3\2\2\2*\u02a7\3\2\2\2,\u02ce\3\2\2\2.\u02de\3\2\2\2\60\u02e0\3\2\2\2"+
		"\62\u02fa\3\2\2\2\64\u02fc\3\2\2\2\66\u0306\3\2\2\28\u0329\3\2\2\2:\u032b"+
		"\3\2\2\2<\u0336\3\2\2\2>\u0343\3\2\2\2@\u037e\3\2\2\2B\u0384\3\2\2\2D"+
		"\u045a\3\2\2\2F\u046f\3\2\2\2H\u0471\3\2\2\2J\u0473\3\2\2\2L\u0475\3\2"+
		"\2\2N\u047f\3\2\2\2P\u04ab\3\2\2\2R\u04b6\3\2\2\2T\u04bb\3\2\2\2V\u04bd"+
		"\3\2\2\2X\u04c2\3\2\2\2Z\u04f1\3\2\2\2\\\u04fc\3\2\2\2^\u0502\3\2\2\2"+
		"`\u0509\3\2\2\2b\u0512\3\2\2\2d\u0519\3\2\2\2f\u051f\3\2\2\2h\u0521\3"+
		"\2\2\2j\u052e\3\2\2\2l\u0530\3\2\2\2n\u0534\3\2\2\2p\u058b\3\2\2\2r\u058d"+
		"\3\2\2\2tu\5\6\4\2uv\7\2\2\3v\3\3\2\2\2wx\5:\36\2xy\7\2\2\3y\5\3\2\2\2"+
		"z\u01ad\5\b\5\2{|\7\u0083\2\2|\u01ad\5j\66\2}~\7\u0083\2\2~\177\5j\66"+
		"\2\177\u0080\7\3\2\2\u0080\u0081\5j\66\2\u0081\u01ad\3\2\2\2\u0082\u0083"+
		"\7d\2\2\u0083\u0087\7e\2\2\u0084\u0085\7\u00b2\2\2\u0085\u0086\7#\2\2"+
		"\u0086\u0088\7%\2\2\u0087\u0084\3\2\2\2\u0087\u0088\3\2\2\2\u0088\u0089"+
		"\3\2\2\2\u0089\u008c\5h\65\2\u008a\u008b\7a\2\2\u008b\u008d\5\16\b\2\u008c"+
		"\u008a\3\2\2\2\u008c\u008d\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u008f\7\16"+
		"\2\2\u008f\u0095\5\b\5\2\u0090\u0092\7a\2\2\u0091\u0093\7$\2\2\u0092\u0091"+
		"\3\2\2\2\u0092\u0093\3\2\2\2\u0093\u0094\3\2\2\2\u0094\u0096\7\u009a\2"+
		"\2\u0095\u0090\3\2\2\2\u0095\u0096\3\2\2\2\u0096\u01ad\3\2\2\2\u0097\u0098"+
		"\7d\2\2\u0098\u009c\7e\2\2\u0099\u009a\7\u00b2\2\2\u009a\u009b\7#\2\2"+
		"\u009b\u009d\7%\2\2\u009c\u0099\3\2\2\2\u009c\u009d\3\2\2\2\u009d\u009e"+
		"\3\2\2\2\u009e\u009f\5h\65\2\u009f\u00a0\7\4\2\2\u00a0\u00a5\5\f\7\2\u00a1"+
		"\u00a2\7\5\2\2\u00a2\u00a4\5\f\7\2\u00a3\u00a1\3\2\2\2\u00a4\u00a7\3\2"+
		"\2\2\u00a5\u00a3\3\2\2\2\u00a5\u00a6\3\2\2\2\u00a6\u00a8\3\2\2\2\u00a7"+
		"\u00a5\3\2\2\2\u00a8\u00ab\7\6\2\2\u00a9\u00aa\7a\2\2\u00aa\u00ac\5\16"+
		"\b\2\u00ab\u00a9\3\2\2\2\u00ab\u00ac\3\2\2\2\u00ac\u01ad\3\2\2\2\u00ad"+
		"\u00ae\7\u0086\2\2\u00ae\u00b1\7e\2\2\u00af\u00b0\7\u00b2\2\2\u00b0\u00b2"+
		"\7%\2\2\u00b1\u00af\3\2\2\2\u00b1\u00b2\3\2\2\2\u00b2\u00b3\3\2\2\2\u00b3"+
		"\u01ad\5h\65\2\u00b4\u00b5\7h\2\2\u00b5\u00b6\7j\2\2\u00b6\u00b8\5h\65"+
		"\2\u00b7\u00b9\5\66\34\2\u00b8\u00b7\3\2\2\2\u00b8\u00b9\3\2\2\2\u00b9"+
		"\u00ba\3\2\2\2\u00ba\u00bb\5\b\5\2\u00bb\u01ad\3\2\2\2\u00bc\u00bd\7i"+
		"\2\2\u00bd\u00be\7\f\2\2\u00be\u00c1\5h\65\2\u00bf\u00c0\7\23\2\2\u00c0"+
		"\u00c2\5<\37\2\u00c1\u00bf\3\2\2\2\u00c1\u00c2\3\2\2\2\u00c2\u01ad\3\2"+
		"\2\2\u00c3\u00c4\7\u0091\2\2\u00c4\u00c5\7e\2\2\u00c5\u00c6\5h\65\2\u00c6"+
		"\u00c7\7\u0092\2\2\u00c7\u00c8\7\u008a\2\2\u00c8\u00c9\5h\65\2\u00c9\u01ad"+
		"\3\2\2\2\u00ca\u00cb\7\u0091\2\2\u00cb\u00cc\7e\2\2\u00cc\u00cd\5h\65"+
		"\2\u00cd\u00ce\7\u0092\2\2\u00ce\u00cf\7\u0082\2\2\u00cf\u00d0\5j\66\2"+
		"\u00d0\u00d1\7\u008a\2\2\u00d1\u00d2\5j\66\2\u00d2\u01ad\3\2\2\2\u00d3"+
		"\u00d4\7\u0091\2\2\u00d4\u00d5\7e\2\2\u00d5\u00d6\5h\65\2\u00d6\u00d7"+
		"\7\r\2\2\u00d7\u00d8\7\u0082\2\2\u00d8\u00d9\5\f\7\2\u00d9\u01ad\3\2\2"+
		"\2\u00da\u00dd\7d\2\2\u00db\u00dc\7 \2\2\u00dc\u00de\7g\2\2\u00dd\u00db"+
		"\3\2\2\2\u00dd\u00de\3\2\2\2\u00de\u00df\3\2\2\2\u00df\u00e0\7f\2\2\u00e0"+
		"\u00e1\5h\65\2\u00e1\u00e2\7\16\2\2\u00e2\u00e3\5\b\5\2\u00e3\u01ad\3"+
		"\2\2\2\u00e4\u00e5\7\u0086\2\2\u00e5\u00e8\7f\2\2\u00e6\u00e7\7\u00b2"+
		"\2\2\u00e7\u00e9\7%\2\2\u00e8\u00e6\3\2\2\2\u00e8\u00e9\3\2\2\2\u00e9"+
		"\u00ea\3\2\2\2\u00ea\u01ad\5h\65\2\u00eb\u00ec\7\u00a9\2\2\u00ec\u00ed"+
		"\5h\65\2\u00ed\u00f6\7\4\2\2\u00ee\u00f3\5d\63\2\u00ef\u00f0\7\5\2\2\u00f0"+
		"\u00f2\5d\63\2\u00f1\u00ef\3\2\2\2\u00f2\u00f5\3\2\2\2\u00f3\u00f1\3\2"+
		"\2\2\u00f3\u00f4\3\2\2\2\u00f4\u00f7\3\2\2\2\u00f5\u00f3\3\2\2\2\u00f6"+
		"\u00ee\3\2\2\2\u00f6\u00f7\3\2\2\2\u00f7\u00f8\3\2\2\2\u00f8\u00f9\7\6"+
		"\2\2\u00f9\u01ad\3\2\2\2\u00fa\u0105\7m\2\2\u00fb\u0100\5f\64\2\u00fc"+
		"\u00fd\7\5\2\2\u00fd\u00ff\5f\64\2\u00fe\u00fc\3\2\2\2\u00ff\u0102\3\2"+
		"\2\2\u0100\u00fe\3\2\2\2\u0100\u0101\3\2\2\2\u0101\u0106\3\2\2\2\u0102"+
		"\u0100\3\2\2\2\u0103\u0104\7\17\2\2\u0104\u0106\7o\2\2\u0105\u00fb\3\2"+
		"\2\2\u0105\u0103\3\2\2\2\u0106\u0107\3\2\2\2\u0107\u0109\7W\2\2\u0108"+
		"\u010a\7e\2\2\u0109\u0108\3\2\2\2\u0109\u010a\3\2\2\2\u010a\u010b\3\2"+
		"\2\2\u010b\u010c\5h\65\2\u010c\u010d\7\u008a\2\2\u010d\u0111\5j\66\2\u010e"+
		"\u010f\7a\2\2\u010f\u0110\7m\2\2\u0110\u0112\7q\2\2\u0111\u010e\3\2\2"+
		"\2\u0111\u0112\3\2\2\2\u0112\u01ad\3\2\2\2\u0113\u0117\7n\2\2\u0114\u0115"+
		"\7m\2\2\u0115\u0116\7q\2\2\u0116\u0118\7\64\2\2\u0117\u0114\3\2\2\2\u0117"+
		"\u0118\3\2\2\2\u0118\u0123\3\2\2\2\u0119\u011e\5f\64\2\u011a\u011b\7\5"+
		"\2\2\u011b\u011d\5f\64\2\u011c\u011a\3\2\2\2\u011d\u0120\3\2\2\2\u011e"+
		"\u011c\3\2\2\2\u011e\u011f\3\2\2\2\u011f\u0124\3\2\2\2\u0120\u011e\3\2"+
		"\2\2\u0121\u0122\7\17\2\2\u0122\u0124\7o\2\2\u0123\u0119\3\2\2\2\u0123"+
		"\u0121\3\2\2\2\u0124\u0125\3\2\2\2\u0125\u0127\7W\2\2\u0126\u0128\7e\2"+
		"\2\u0127\u0126\3\2\2\2\u0127\u0128\3\2\2\2\u0128\u0129\3\2\2\2\u0129\u012a"+
		"\5h\65\2\u012a\u012b\7\f\2\2\u012b\u012c\5j\66\2\u012c\u01ad\3\2\2\2\u012d"+
		"\u012f\7r\2\2\u012e\u0130\7s\2\2\u012f\u012e\3\2\2\2\u012f\u0130\3\2\2"+
		"\2\u0130\u013c\3\2\2\2\u0131\u0132\7\4\2\2\u0132\u0137\5^\60\2\u0133\u0134"+
		"\7\5\2\2\u0134\u0136\5^\60\2\u0135\u0133\3\2\2\2\u0136\u0139\3\2\2\2\u0137"+
		"\u0135\3\2\2\2\u0137\u0138\3\2\2\2\u0138\u013a\3\2\2\2\u0139\u0137\3\2"+
		"\2\2\u013a\u013b\7\6\2\2\u013b\u013d\3\2\2\2\u013c\u0131\3\2\2\2\u013c"+
		"\u013d\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u01ad\5\6\4\2\u013f\u0140\7}"+
		"\2\2\u0140\u0141\7d\2\2\u0141\u0142\7e\2\2\u0142\u01ad\5h\65\2\u0143\u0144"+
		"\7}\2\2\u0144\u0145\7d\2\2\u0145\u0146\7f\2\2\u0146\u01ad\5h\65\2\u0147"+
		"\u0148\7}\2\2\u0148\u014b\7~\2\2\u0149\u014a\t\2\2\2\u014a\u014c\5h\65"+
		"\2\u014b\u0149\3\2\2\2\u014b\u014c\3\2\2\2\u014c\u014f\3\2\2\2\u014d\u014e"+
		"\7\'\2\2\u014e\u0150\7\u00c1\2\2\u014f\u014d\3\2\2\2\u014f\u0150\3\2\2"+
		"\2\u0150\u01ad\3\2\2\2\u0151\u0152\7}\2\2\u0152\u0155\7\177\2\2\u0153"+
		"\u0154\t\2\2\2\u0154\u0156\5j\66\2\u0155\u0153\3\2\2\2\u0155\u0156\3\2"+
		"\2\2\u0156\u0159\3\2\2\2\u0157\u0158\7\'\2\2\u0158\u015a\7\u00c1\2\2\u0159"+
		"\u0157\3\2\2\2\u0159\u015a\3\2\2\2\u015a\u01ad\3\2\2\2\u015b\u015c\7}"+
		"\2\2\u015c\u015f\7\u0080\2\2\u015d\u015e\7\'\2\2\u015e\u0160\7\u00c1\2"+
		"\2\u015f\u015d\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u01ad\3\2\2\2\u0161\u0162"+
		"\7}\2\2\u0162\u0163\7\u0081\2\2\u0163\u0164\t\2\2\2\u0164\u01ad\5h\65"+
		"\2\u0165\u0166\7l\2\2\u0166\u01ad\5h\65\2\u0167\u0168\7\61\2\2\u0168\u01ad"+
		"\5h\65\2\u0169\u016a\7}\2\2\u016a\u01ad\7\u0085\2\2\u016b\u016c\7}\2\2"+
		"\u016c\u01ad\7\u0099\2\2\u016d\u016e\7\u0097\2\2\u016e\u016f\7\u0099\2"+
		"\2\u016f\u0170\5h\65\2\u0170\u0171\7\u00b5\2\2\u0171\u0172\5:\36\2\u0172"+
		"\u01ad\3\2\2\2\u0173\u0174\7\u0098\2\2\u0174\u0175\7\u0099\2\2\u0175\u01ad"+
		"\5h\65\2\u0176\u0177\7\u009b\2\2\u0177\u0180\7\u009c\2\2\u0178\u017d\5"+
		"`\61\2\u0179\u017a\7\5\2\2\u017a\u017c\5`\61\2\u017b\u0179\3\2\2\2\u017c"+
		"\u017f\3\2\2\2\u017d\u017b\3\2\2\2\u017d\u017e\3\2\2\2\u017e\u0181\3\2"+
		"\2\2\u017f\u017d\3\2\2\2\u0180\u0178\3\2\2\2\u0180\u0181\3\2\2\2\u0181"+
		"\u01ad\3\2\2\2\u0182\u0184\7\u009d\2\2\u0183\u0185\7\u009f\2\2\u0184\u0183"+
		"\3\2\2\2\u0184\u0185\3\2\2\2\u0185\u01ad\3\2\2\2\u0186\u0188\7\u009e\2"+
		"\2\u0187\u0189\7\u009f\2\2\u0188\u0187\3\2\2\2\u0188\u0189\3\2\2\2\u0189"+
		"\u01ad\3\2\2\2\u018a\u018b\7}\2\2\u018b\u018c\7\u0084\2\2\u018c\u018d"+
		"\t\2\2\2\u018d\u0190\5h\65\2\u018e\u018f\7\23\2\2\u018f\u0191\5<\37\2"+
		"\u0190\u018e\3\2\2\2\u0190\u0191\3\2\2\2\u0191\u019c\3\2\2\2\u0192\u0193"+
		"\7\32\2\2\u0193\u0194\7\25\2\2\u0194\u0199\5\30\r\2\u0195\u0196\7\5\2"+
		"\2\u0196\u0198\5\30\r\2\u0197\u0195\3\2\2\2\u0198\u019b\3\2\2\2\u0199"+
		"\u0197\3\2\2\2\u0199\u019a\3\2\2\2\u019a\u019d\3\2\2\2\u019b\u0199\3\2"+
		"\2\2\u019c\u0192\3\2\2\2\u019c\u019d\3\2\2\2\u019d\u01a0\3\2\2\2\u019e"+
		"\u019f\7\34\2\2\u019f\u01a1\t\3\2\2\u01a0\u019e\3\2\2\2\u01a0\u01a1\3"+
		"\2\2\2\u01a1\u01ad\3\2\2\2\u01a2\u01a3\7\u00aa\2\2\u01a3\u01a4\5j\66\2"+
		"\u01a4\u01a5\7\f\2\2\u01a5\u01a6\5\6\4\2\u01a6\u01ad\3\2\2\2\u01a7\u01a8"+
		"\7\u00ab\2\2\u01a8\u01a9\7\u00aa\2\2\u01a9\u01ad\5j\66\2\u01aa\u01ab\7"+
		"\u00ac\2\2\u01ab\u01ad\5j\66\2\u01acz\3\2\2\2\u01ac{\3\2\2\2\u01ac}\3"+
		"\2\2\2\u01ac\u0082\3\2\2\2\u01ac\u0097\3\2\2\2\u01ac\u00ad\3\2\2\2\u01ac"+
		"\u00b4\3\2\2\2\u01ac\u00bc\3\2\2\2\u01ac\u00c3\3\2\2\2\u01ac\u00ca\3\2"+
		"\2\2\u01ac\u00d3\3\2\2\2\u01ac\u00da\3\2\2\2\u01ac\u00e4\3\2\2\2\u01ac"+
		"\u00eb\3\2\2\2\u01ac\u00fa\3\2\2\2\u01ac\u0113\3\2\2\2\u01ac\u012d\3\2"+
		"\2\2\u01ac\u013f\3\2\2\2\u01ac\u0143\3\2\2\2\u01ac\u0147\3\2\2\2\u01ac"+
		"\u0151\3\2\2\2\u01ac\u015b\3\2\2\2\u01ac\u0161\3\2\2\2\u01ac\u0165\3\2"+
		"\2\2\u01ac\u0167\3\2\2\2\u01ac\u0169\3\2\2\2\u01ac\u016b\3\2\2\2\u01ac"+
		"\u016d\3\2\2\2\u01ac\u0173\3\2\2\2\u01ac\u0176\3\2\2\2\u01ac\u0182\3\2"+
		"\2\2\u01ac\u0186\3\2\2\2\u01ac\u018a\3\2\2\2\u01ac\u01a2\3\2\2\2\u01ac"+
		"\u01a7\3\2\2\2\u01ac\u01aa\3\2\2\2\u01ad\7\3\2\2\2\u01ae\u01b0\5\n\6\2"+
		"\u01af\u01ae\3\2\2\2\u01af\u01b0\3\2\2\2\u01b0\u01b1\3\2\2\2\u01b1\u01b2"+
		"\5\22\n\2\u01b2\t\3\2\2\2\u01b3\u01b5\7a\2\2\u01b4\u01b6\7b\2\2\u01b5"+
		"\u01b4\3\2\2\2\u01b5\u01b6\3\2\2\2\u01b6\u01b7\3\2\2\2\u01b7\u01bc\5$"+
		"\23\2\u01b8\u01b9\7\5\2\2\u01b9\u01bb\5$\23\2\u01ba\u01b8\3\2\2\2\u01bb"+
		"\u01be\3\2\2\2\u01bc\u01ba\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\13\3\2\2"+
		"\2\u01be\u01bc\3\2\2\2\u01bf\u01c0\5j\66\2\u01c0\u01c1\5P)\2\u01c1\r\3"+
		"\2\2\2\u01c2\u01c3\7\4\2\2\u01c3\u01c8\5\20\t\2\u01c4\u01c5\7\5\2\2\u01c5"+
		"\u01c7\5\20\t\2\u01c6\u01c4\3\2\2\2\u01c7\u01ca\3\2\2\2\u01c8\u01c6\3"+
		"\2\2\2\u01c8\u01c9\3\2\2\2\u01c9\u01cb\3\2\2\2\u01ca\u01c8\3\2\2\2\u01cb"+
		"\u01cc\7\6\2\2\u01cc\17\3\2\2\2\u01cd\u01ce\5j\66\2\u01ce\u01cf\7\u00b5"+
		"\2\2\u01cf\u01d0\5:\36\2\u01d0\21\3\2\2\2\u01d1\u01dc\5\24\13\2\u01d2"+
		"\u01d3\7\32\2\2\u01d3\u01d4\7\25\2\2\u01d4\u01d9\5\30\r\2\u01d5\u01d6"+
		"\7\5\2\2\u01d6\u01d8\5\30\r\2\u01d7\u01d5\3\2\2\2\u01d8\u01db\3\2\2\2"+
		"\u01d9\u01d7\3\2\2\2\u01d9\u01da\3\2\2\2\u01da\u01dd\3\2\2\2\u01db\u01d9"+
		"\3\2\2\2\u01dc\u01d2\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd\u01e0\3\2\2\2\u01de"+
		"\u01df\7\34\2\2\u01df\u01e1\t\3\2\2\u01e0\u01de\3\2\2\2\u01e0\u01e1\3"+
		"\2\2\2\u01e1\u01e7\3\2\2\2\u01e2\u01e3\7\35\2\2\u01e3\u01e4\7\36\2\2\u01e4"+
		"\u01e5\5n8\2\u01e5\u01e6\7\37\2\2\u01e6\u01e8\3\2\2\2\u01e7\u01e2\3\2"+
		"\2\2\u01e7\u01e8\3\2\2\2\u01e8\23\3\2\2\2\u01e9\u01ea\b\13\1\2\u01ea\u01eb"+
		"\5\26\f\2\u01eb\u01fa\3\2\2\2\u01ec\u01ed\f\4\2\2\u01ed\u01ef\7\u0089"+
		"\2\2\u01ee\u01f0\5&\24\2\u01ef\u01ee\3\2\2\2\u01ef\u01f0\3\2\2\2\u01f0"+
		"\u01f1\3\2\2\2\u01f1\u01f9\5\24\13\5\u01f2\u01f3\f\3\2\2\u01f3\u01f5\t"+
		"\4\2\2\u01f4\u01f6\5&\24\2\u01f5\u01f4\3\2\2\2\u01f5\u01f6\3\2\2\2\u01f6"+
		"\u01f7\3\2\2\2\u01f7\u01f9\5\24\13\4\u01f8\u01ec\3\2\2\2\u01f8\u01f2\3"+
		"\2\2\2\u01f9\u01fc\3\2\2\2\u01fa\u01f8\3\2\2\2\u01fa\u01fb\3\2\2\2\u01fb"+
		"\25\3\2\2\2\u01fc\u01fa\3\2\2\2\u01fd\u020e\5\32\16\2\u01fe\u01ff\7e\2"+
		"\2\u01ff\u020e\5h\65\2\u0200\u0201\7c\2\2\u0201\u0206\5:\36\2\u0202\u0203"+
		"\7\5\2\2\u0203\u0205\5:\36\2\u0204\u0202\3\2\2\2\u0205\u0208\3\2\2\2\u0206"+
		"\u0204\3\2\2\2\u0206\u0207\3\2\2\2\u0207\u020e\3\2\2\2\u0208\u0206\3\2"+
		"\2\2\u0209\u020a\7\4\2\2\u020a\u020b\5\22\n\2\u020b\u020c\7\6\2\2\u020c"+
		"\u020e\3\2\2\2\u020d\u01fd\3\2\2\2\u020d\u01fe\3\2\2\2\u020d\u0200\3\2"+
		"\2\2\u020d\u0209\3\2\2\2\u020e\27\3\2\2\2\u020f\u0211\5:\36\2\u0210\u0212"+
		"\t\5\2\2\u0211\u0210\3\2\2\2\u0211\u0212\3\2\2\2\u0212\u0215\3\2\2\2\u0213"+
		"\u0214\7,\2\2\u0214\u0216\t\6\2\2\u0215\u0213\3\2\2\2\u0215\u0216\3\2"+
		"\2\2\u0216\31\3\2\2\2\u0217\u0219\7\13\2\2\u0218\u021a\5&\24\2\u0219\u0218"+
		"\3\2\2\2\u0219\u021a\3\2\2\2\u021a\u021b\3\2\2\2\u021b\u0220\5(\25\2\u021c"+
		"\u021d\7\5\2\2\u021d\u021f\5(\25\2\u021e\u021c\3\2\2\2\u021f\u0222\3\2"+
		"\2\2\u0220\u021e\3\2\2\2\u0220\u0221\3\2\2\2\u0221\u022c\3\2\2\2\u0222"+
		"\u0220\3\2\2\2\u0223\u0224\7\f\2\2\u0224\u0229\5*\26\2\u0225\u0226\7\5"+
		"\2\2\u0226\u0228\5*\26\2\u0227\u0225\3\2\2\2\u0228\u022b\3\2\2\2\u0229"+
		"\u0227\3\2\2\2\u0229\u022a\3\2\2\2\u022a\u022d\3\2\2\2\u022b\u0229\3\2"+
		"\2\2\u022c\u0223\3\2\2\2\u022c\u022d\3\2\2\2\u022d\u0230\3\2\2\2\u022e"+
		"\u022f\7\23\2\2\u022f\u0231\5<\37\2\u0230\u022e\3\2\2\2\u0230\u0231\3"+
		"\2\2\2\u0231\u0235\3\2\2\2\u0232\u0233\7\24\2\2\u0233\u0234\7\25\2\2\u0234"+
		"\u0236\5\34\17\2\u0235\u0232\3\2\2\2\u0235\u0236\3\2\2\2\u0236\u0239\3"+
		"\2\2\2\u0237\u0238\7\33\2\2\u0238\u023a\5<\37\2\u0239\u0237\3\2\2\2\u0239"+
		"\u023a\3\2\2\2\u023a\33\3\2\2\2\u023b\u023d\5&\24\2\u023c\u023b\3\2\2"+
		"\2\u023c\u023d\3\2\2\2\u023d\u023e\3\2\2\2\u023e\u0243\5\36\20\2\u023f"+
		"\u0240\7\5\2\2\u0240\u0242\5\36\20\2\u0241\u023f\3\2\2\2\u0242\u0245\3"+
		"\2\2\2\u0243\u0241\3\2\2\2\u0243\u0244\3\2\2\2\u0244\35\3\2\2\2\u0245"+
		"\u0243\3\2\2\2\u0246\u026f\5 \21\2\u0247\u0248\7\31\2\2\u0248\u0251\7"+
		"\4\2\2\u0249\u024e\5h\65\2\u024a\u024b\7\5\2\2\u024b\u024d\5h\65\2\u024c"+
		"\u024a\3\2\2\2\u024d\u0250\3\2\2\2\u024e\u024c\3\2\2\2\u024e\u024f\3\2"+
		"\2\2\u024f\u0252\3\2\2\2\u0250\u024e\3\2\2\2\u0251\u0249\3\2\2\2\u0251"+
		"\u0252\3\2\2\2\u0252\u0253\3\2\2\2\u0253\u026f\7\6\2\2\u0254\u0255\7\30"+
		"\2\2\u0255\u025e\7\4\2\2\u0256\u025b\5h\65\2\u0257\u0258\7\5\2\2\u0258"+
		"\u025a\5h\65\2\u0259\u0257\3\2\2\2\u025a\u025d\3\2\2\2\u025b\u0259\3\2"+
		"\2\2\u025b\u025c\3\2\2\2\u025c\u025f\3\2\2\2\u025d\u025b\3\2\2\2\u025e"+
		"\u0256\3\2\2\2\u025e\u025f\3\2\2\2\u025f\u0260\3\2\2\2\u0260\u026f\7\6"+
		"\2\2\u0261\u0262\7\26\2\2\u0262\u0263\7\27\2\2\u0263\u0264\7\4\2\2\u0264"+
		"\u0269\5\"\22\2\u0265\u0266\7\5\2\2\u0266\u0268\5\"\22\2\u0267\u0265\3"+
		"\2\2\2\u0268\u026b\3\2\2\2\u0269\u0267\3\2\2\2\u0269\u026a\3\2\2\2\u026a"+
		"\u026c\3\2\2\2\u026b\u0269\3\2\2\2\u026c\u026d\7\6\2\2\u026d\u026f\3\2"+
		"\2\2\u026e\u0246\3\2\2\2\u026e\u0247\3\2\2\2\u026e\u0254\3\2\2\2\u026e"+
		"\u0261\3\2\2\2\u026f\37\3\2\2\2\u0270\u0279\7\4\2\2\u0271\u0276\5:\36"+
		"\2\u0272\u0273\7\5\2\2\u0273\u0275\5:\36\2\u0274\u0272\3\2\2\2\u0275\u0278"+
		"\3\2\2\2\u0276\u0274\3\2\2\2\u0276\u0277\3\2\2\2\u0277\u027a\3\2\2\2\u0278"+
		"\u0276\3\2\2\2\u0279\u0271\3\2\2\2\u0279\u027a\3\2\2\2\u027a\u027b\3\2"+
		"\2\2\u027b\u027e\7\6\2\2\u027c\u027e\5:\36\2\u027d\u0270\3\2\2\2\u027d"+
		"\u027c\3\2\2\2\u027e!\3\2\2\2\u027f\u0288\7\4\2\2\u0280\u0285\5h\65\2"+
		"\u0281\u0282\7\5\2\2\u0282\u0284\5h\65\2\u0283\u0281\3\2\2\2\u0284\u0287"+
		"\3\2\2\2\u0285\u0283\3\2\2\2\u0285\u0286\3\2\2\2\u0286\u0289\3\2\2\2\u0287"+
		"\u0285\3\2\2\2\u0288\u0280\3\2\2\2\u0288\u0289\3\2\2\2\u0289\u028a\3\2"+
		"\2\2\u028a\u028d\7\6\2\2\u028b\u028d\5h\65\2\u028c\u027f\3\2\2\2\u028c"+
		"\u028b\3\2\2\2\u028d#\3\2\2\2\u028e\u0290\5j\66\2\u028f\u0291\5\66\34"+
		"\2\u0290\u028f\3\2\2\2\u0290\u0291\3\2\2\2\u0291\u0292\3\2\2\2\u0292\u0293"+
		"\7\16\2\2\u0293\u0294\7\4\2\2\u0294\u0295\5\b\5\2\u0295\u0296\7\6\2\2"+
		"\u0296%\3\2\2\2\u0297\u0298\t\7\2\2\u0298\'\3\2\2\2\u0299\u029e\5:\36"+
		"\2\u029a\u029c\7\16\2\2\u029b\u029a\3\2\2\2\u029b\u029c\3\2\2\2\u029c"+
		"\u029d\3\2\2\2\u029d\u029f\5j\66\2\u029e\u029b\3\2\2\2\u029e\u029f\3\2"+
		"\2\2\u029f\u02a6\3\2\2\2\u02a0\u02a1\5h\65\2\u02a1\u02a2\7\3\2\2\u02a2"+
		"\u02a3\7\u00bd\2\2\u02a3\u02a6\3\2\2\2\u02a4\u02a6\7\u00bd\2\2\u02a5\u0299"+
		"\3\2\2\2\u02a5\u02a0\3\2\2\2\u02a5\u02a4\3\2\2\2\u02a6)\3\2\2\2\u02a7"+
		"\u02a8\b\26\1\2\u02a8\u02a9\5\60\31\2\u02a9\u02bc\3\2\2\2\u02aa\u02b8"+
		"\f\4\2\2\u02ab\u02ac\7O\2\2\u02ac\u02ad\7N\2\2\u02ad\u02b9\5\60\31\2\u02ae"+
		"\u02af\5,\27\2\u02af\u02b0\7N\2\2\u02b0\u02b1\5*\26\2\u02b1\u02b2\5.\30"+
		"\2\u02b2\u02b9\3\2\2\2\u02b3\u02b4\7U\2\2\u02b4\u02b5\5,\27\2\u02b5\u02b6"+
		"\7N\2\2\u02b6\u02b7\5\60\31\2\u02b7\u02b9\3\2\2\2\u02b8\u02ab\3\2\2\2"+
		"\u02b8\u02ae\3\2\2\2\u02b8\u02b3\3\2\2\2\u02b9\u02bb\3\2\2\2\u02ba\u02aa"+
		"\3\2\2\2\u02bb\u02be\3\2\2\2\u02bc\u02ba\3\2\2\2\u02bc\u02bd\3\2\2\2\u02bd"+
		"+\3\2\2\2\u02be\u02bc\3\2\2\2\u02bf\u02c1\7Q\2\2\u02c0\u02bf\3\2\2\2\u02c0"+
		"\u02c1\3\2\2\2\u02c1\u02cf\3\2\2\2\u02c2\u02c4\7R\2\2\u02c3\u02c5\7P\2"+
		"\2\u02c4\u02c3\3\2\2\2\u02c4\u02c5\3\2\2\2\u02c5\u02cf\3\2\2\2\u02c6\u02c8"+
		"\7S\2\2\u02c7\u02c9\7P\2\2\u02c8\u02c7\3\2\2\2\u02c8\u02c9\3\2\2\2\u02c9"+
		"\u02cf\3\2\2\2\u02ca\u02cc\7T\2\2\u02cb\u02cd\7P\2\2\u02cc\u02cb\3\2\2"+
		"\2\u02cc\u02cd\3\2\2\2\u02cd\u02cf\3\2\2\2\u02ce\u02c0\3\2\2\2\u02ce\u02c2"+
		"\3\2\2\2\u02ce\u02c6\3\2\2\2\u02ce\u02ca\3\2\2\2\u02cf-\3\2\2\2\u02d0"+
		"\u02d1\7W\2\2\u02d1\u02df\5<\37\2\u02d2\u02d3\7V\2\2\u02d3\u02d4\7\4\2"+
		"\2\u02d4\u02d9\5j\66\2\u02d5\u02d6\7\5\2\2\u02d6\u02d8\5j\66\2\u02d7\u02d5"+
		"\3\2\2\2\u02d8\u02db\3\2\2\2\u02d9\u02d7\3\2\2\2\u02d9\u02da\3\2\2\2\u02da"+
		"\u02dc\3\2\2\2\u02db\u02d9\3\2\2\2\u02dc\u02dd\7\6\2\2\u02dd\u02df\3\2"+
		"\2\2\u02de\u02d0\3\2\2\2\u02de\u02d2\3\2\2\2\u02df/\3\2\2\2\u02e0\u02f8"+
		"\5\64\33\2\u02e1\u02e2\7\u008e\2\2\u02e2\u02e3\5\62\32\2\u02e3\u02e4\7"+
		"\4\2\2\u02e4\u02e5\5:\36\2\u02e5\u02e7\7\6\2\2\u02e6\u02e8\7\u008f\2\2"+
		"\u02e7\u02e6\3\2\2\2\u02e7\u02e8\3\2\2\2\u02e8\u02f6\3\2\2\2\u02e9\u02ea"+
		"\7\u0090\2\2\u02ea\u02eb\7W\2\2\u02eb\u02ec\7\4\2\2\u02ec\u02f1\5:\36"+
		"\2\u02ed\u02ee\7\5\2\2\u02ee\u02f0\5:\36\2\u02ef\u02ed\3\2\2\2\u02f0\u02f3"+
		"\3\2\2\2\u02f1\u02ef\3\2\2\2\u02f1\u02f2\3\2\2\2\u02f2\u02f4\3\2\2\2\u02f3"+
		"\u02f1\3\2\2\2\u02f4\u02f5\7\6\2\2\u02f5\u02f7\3\2\2\2\u02f6\u02e9\3\2"+
		"\2\2\u02f6\u02f7\3\2\2\2\u02f7\u02f9\3\2\2\2\u02f8\u02e1\3\2\2\2\u02f8"+
		"\u02f9\3\2\2\2\u02f9\61\3\2\2\2\u02fa\u02fb\t\b\2\2\u02fb\63\3\2\2\2\u02fc"+
		"\u0304\58\35\2\u02fd\u02ff\7\16\2\2\u02fe\u02fd\3\2\2\2\u02fe\u02ff\3"+
		"\2\2\2\u02ff\u0300\3\2\2\2\u0300\u0302\5j\66\2\u0301\u0303\5\66\34\2\u0302"+
		"\u0301\3\2\2\2\u0302\u0303\3\2\2\2\u0303\u0305\3\2\2\2\u0304\u02fe\3\2"+
		"\2\2\u0304\u0305\3\2\2\2\u0305\65\3\2\2\2\u0306\u0307\7\4\2\2\u0307\u030c"+
		"\5j\66\2\u0308\u0309\7\5\2\2\u0309\u030b\5j\66\2\u030a\u0308\3\2\2\2\u030b"+
		"\u030e\3\2\2\2\u030c\u030a\3\2\2\2\u030c\u030d\3\2\2\2\u030d\u030f\3\2"+
		"\2\2\u030e\u030c\3\2\2\2\u030f\u0310\7\6\2\2\u0310\67\3\2\2\2\u0311\u032a"+
		"\5h\65\2\u0312\u0313\7\4\2\2\u0313\u0314\5\b\5\2\u0314\u0315\7\6\2\2\u0315"+
		"\u032a\3\2\2\2\u0316\u0317\7\u0093\2\2\u0317\u0318\7\4\2\2\u0318\u031d"+
		"\5:\36\2\u0319\u031a\7\5\2\2\u031a\u031c\5:\36\2\u031b\u0319\3\2\2\2\u031c"+
		"\u031f\3\2\2\2\u031d\u031b\3\2\2\2\u031d\u031e\3\2\2\2\u031e\u0320\3\2"+
		"\2\2\u031f\u031d\3\2\2\2\u0320\u0323\7\6\2\2\u0321\u0322\7a\2\2\u0322"+
		"\u0324\7\u0094\2\2\u0323\u0321\3\2\2\2\u0323\u0324\3\2\2\2\u0324\u032a"+
		"\3\2\2\2\u0325\u0326\7\4\2\2\u0326\u0327\5*\26\2\u0327\u0328\7\6\2\2\u0328"+
		"\u032a\3\2\2\2\u0329\u0311\3\2\2\2\u0329\u0312\3\2\2\2\u0329\u0316\3\2"+
		"\2\2\u0329\u0325\3\2\2\2\u032a9\3\2\2\2\u032b\u032c\5<\37\2\u032c;\3\2"+
		"\2\2\u032d\u032e\b\37\1\2\u032e\u032f\7#\2\2\u032f\u0337\5<\37\6\u0330"+
		"\u0337\5> \2\u0331\u0332\7%\2\2\u0332\u0333\7\4\2\2\u0333\u0334\5\b\5"+
		"\2\u0334\u0335\7\6\2\2\u0335\u0337\3\2\2\2\u0336\u032d\3\2\2\2\u0336\u0330"+
		"\3\2\2\2\u0336\u0331\3\2\2\2\u0337\u0340\3\2\2\2\u0338\u0339\f\5\2\2\u0339"+
		"\u033a\7!\2\2\u033a\u033f\5<\37\6\u033b\u033c\f\4\2\2\u033c\u033d\7 \2"+
		"\2\u033d\u033f\5<\37\5\u033e\u0338\3\2\2\2\u033e\u033b\3\2\2\2\u033f\u0342"+
		"\3\2\2\2\u0340\u033e\3\2\2\2\u0340\u0341\3\2\2\2\u0341=\3\2\2\2\u0342"+
		"\u0340\3\2\2\2\u0343\u0345\5B\"\2\u0344\u0346\5@!\2\u0345\u0344\3\2\2"+
		"\2\u0345\u0346\3\2\2\2\u0346?\3\2\2\2\u0347\u0348\5H%\2\u0348\u0349\5"+
		"B\"\2\u0349\u037f\3\2\2\2\u034a\u034c\7#\2\2\u034b\u034a\3\2\2\2\u034b"+
		"\u034c\3\2\2\2\u034c\u034d\3\2\2\2\u034d\u034e\7&\2\2\u034e\u034f\5B\""+
		"\2\u034f\u0350\7!\2\2\u0350\u0351\5B\"\2\u0351\u037f\3\2\2\2\u0352\u0354"+
		"\7#\2\2\u0353\u0352\3\2\2\2\u0353\u0354\3\2\2\2\u0354\u0355\3\2\2\2\u0355"+
		"\u0356\7\"\2\2\u0356\u0357\7\4\2\2\u0357\u035c\5:\36\2\u0358\u0359\7\5"+
		"\2\2\u0359\u035b\5:\36\2\u035a\u0358\3\2\2\2\u035b\u035e\3\2\2\2\u035c"+
		"\u035a\3\2\2\2\u035c\u035d\3\2\2\2\u035d\u035f\3\2\2\2\u035e\u035c\3\2"+
		"\2\2\u035f\u0360\7\6\2\2\u0360\u037f\3\2\2\2\u0361\u0363\7#\2\2\u0362"+
		"\u0361\3\2\2\2\u0362\u0363\3\2\2\2\u0363\u0364\3\2\2\2\u0364\u0365\7\""+
		"\2\2\u0365\u0366\7\4\2\2\u0366\u0367\5\b\5\2\u0367\u0368\7\6\2\2\u0368"+
		"\u037f\3\2\2\2\u0369\u036b\7#\2\2\u036a\u0369\3\2\2\2\u036a\u036b\3\2"+
		"\2\2\u036b\u036c\3\2\2\2\u036c\u036d\7\'\2\2\u036d\u0370\5B\"\2\u036e"+
		"\u036f\7/\2\2\u036f\u0371\5B\"\2\u0370\u036e\3\2\2\2\u0370\u0371\3\2\2"+
		"\2\u0371\u037f\3\2\2\2\u0372\u0374\7(\2\2\u0373\u0375\7#\2\2\u0374\u0373"+
		"\3\2\2\2\u0374\u0375\3\2\2\2\u0375\u0376\3\2\2\2\u0376\u037f\7)\2\2\u0377"+
		"\u0379\7(\2\2\u0378\u037a\7#\2\2\u0379\u0378\3\2\2\2\u0379\u037a\3\2\2"+
		"\2\u037a\u037b\3\2\2\2\u037b\u037c\7\22\2\2\u037c\u037d\7\f\2\2\u037d"+
		"\u037f\5B\"\2\u037e\u0347\3\2\2\2\u037e\u034b\3\2\2\2\u037e\u0353\3\2"+
		"\2\2\u037e\u0362\3\2\2\2\u037e\u036a\3\2\2\2\u037e\u0372\3\2\2\2\u037e"+
		"\u0377\3\2\2\2\u037fA\3\2\2\2\u0380\u0381\b\"\1\2\u0381\u0382\t\t\2\2"+
		"\u0382\u0385\5B\"\6\u0383\u0385\5D#\2\u0384\u0380\3\2\2\2\u0384\u0383"+
		"\3\2\2\2\u0385\u0394\3\2\2\2\u0386\u0387\f\5\2\2\u0387\u0388\t\n\2\2\u0388"+
		"\u0393\5B\"\6\u0389\u038a\f\4\2\2\u038a\u038b\t\t\2\2\u038b\u0393\5B\""+
		"\5\u038c\u038d\f\3\2\2\u038d\u038e\7\u00c0\2\2\u038e\u0393\5B\"\4\u038f"+
		"\u0390\f\7\2\2\u0390\u0391\7\36\2\2\u0391\u0393\5F$\2\u0392\u0386\3\2"+
		"\2\2\u0392\u0389\3\2\2\2\u0392\u038c\3\2\2\2\u0392\u038f\3\2\2\2\u0393"+
		"\u0396\3\2\2\2\u0394\u0392\3\2\2\2\u0394\u0395\3\2\2\2\u0395C\3\2\2\2"+
		"\u0396\u0394\3\2\2\2\u0397\u0398\b#\1\2\u0398\u045b\7)\2\2\u0399\u045b"+
		"\5L\'\2\u039a\u039b\5j\66\2\u039b\u039c\7\u00c1\2\2\u039c\u045b\3\2\2"+
		"\2\u039d\u045b\5n8\2\u039e\u045b\5J&\2\u039f\u045b\7\u00c1\2\2\u03a0\u045b"+
		"\7\u00c2\2\2\u03a1\u03a2\7\63\2\2\u03a2\u03a3\7\4\2\2\u03a3\u03a4\5B\""+
		"\2\u03a4\u03a5\7\"\2\2\u03a5\u03a6\5B\"\2\u03a6\u03a7\7\6\2\2\u03a7\u045b"+
		"\3\2\2\2\u03a8\u03a9\7\4\2\2\u03a9\u03ac\5:\36\2\u03aa\u03ab\7\5\2\2\u03ab"+
		"\u03ad\5:\36\2\u03ac\u03aa\3\2\2\2\u03ad\u03ae\3\2\2\2\u03ae\u03ac\3\2"+
		"\2\2\u03ae\u03af\3\2\2\2\u03af\u03b0\3\2\2\2\u03b0\u03b1\7\6\2\2\u03b1"+
		"\u045b\3\2\2\2\u03b2\u03b3\7`\2\2\u03b3\u03b4\7\4\2\2\u03b4\u03b9\5:\36"+
		"\2\u03b5\u03b6\7\5\2\2\u03b6\u03b8\5:\36\2\u03b7\u03b5\3\2\2\2\u03b8\u03bb"+
		"\3\2\2\2\u03b9\u03b7\3\2\2\2\u03b9\u03ba\3\2\2\2\u03ba\u03bc\3\2\2\2\u03bb"+
		"\u03b9\3\2\2\2\u03bc\u03bd\7\6\2\2\u03bd\u045b\3\2\2\2\u03be\u03bf\5h"+
		"\65\2\u03bf\u03c0\7\4\2\2\u03c0\u03c1\7\u00bd\2\2\u03c1\u03c3\7\6\2\2"+
		"\u03c2\u03c4\5X-\2\u03c3\u03c2\3\2\2\2\u03c3\u03c4\3\2\2\2\u03c4\u045b"+
		"\3\2\2\2\u03c5\u03c6\5h\65\2\u03c6\u03d2\7\4\2\2\u03c7\u03c9\5&\24\2\u03c8"+
		"\u03c7\3\2\2\2\u03c8\u03c9\3\2\2\2\u03c9\u03ca\3\2\2\2\u03ca\u03cf\5:"+
		"\36\2\u03cb\u03cc\7\5\2\2\u03cc\u03ce\5:\36\2\u03cd\u03cb\3\2\2\2\u03ce"+
		"\u03d1\3\2\2\2\u03cf\u03cd\3\2\2\2\u03cf\u03d0\3\2\2\2\u03d0\u03d3\3\2"+
		"\2\2\u03d1\u03cf\3\2\2\2\u03d2\u03c8\3\2\2\2\u03d2\u03d3\3\2\2\2\u03d3"+
		"\u03d4\3\2\2\2\u03d4\u03d6\7\6\2\2\u03d5\u03d7\5X-\2\u03d6\u03d5\3\2\2"+
		"\2\u03d6\u03d7\3\2\2\2\u03d7\u045b\3\2\2\2\u03d8\u03d9\5j\66\2\u03d9\u03da"+
		"\7\7\2\2\u03da\u03db\5:\36\2\u03db\u045b\3\2\2\2\u03dc\u03dd\7\4\2\2\u03dd"+
		"\u03e2\5j\66\2\u03de\u03df\7\5\2\2\u03df\u03e1\5j\66\2\u03e0\u03de\3\2"+
		"\2\2\u03e1\u03e4\3\2\2\2\u03e2\u03e0\3\2\2\2\u03e2\u03e3\3\2\2\2\u03e3"+
		"\u03e5\3\2\2\2\u03e4\u03e2\3\2\2\2\u03e5\u03e6\7\6\2\2\u03e6\u03e7\7\7"+
		"\2\2\u03e7\u03e8\5:\36\2\u03e8\u045b\3\2\2\2\u03e9\u03ea\7\4\2\2\u03ea"+
		"\u03eb\5\b\5\2\u03eb\u03ec\7\6\2\2\u03ec\u045b\3\2\2\2\u03ed\u03ee\7I"+
		"\2\2\u03ee\u03f0\5B\"\2\u03ef\u03f1\5V,\2\u03f0\u03ef\3\2\2\2\u03f1\u03f2"+
		"\3\2\2\2\u03f2\u03f0\3\2\2\2\u03f2\u03f3\3\2\2\2\u03f3\u03f6\3\2\2\2\u03f4"+
		"\u03f5\7L\2\2\u03f5\u03f7\5:\36\2\u03f6\u03f4\3\2\2\2\u03f6\u03f7\3\2"+
		"\2\2\u03f7\u03f8\3\2\2\2\u03f8\u03f9\7M\2\2\u03f9\u045b\3\2\2\2\u03fa"+
		"\u03fc\7I\2\2\u03fb\u03fd\5V,\2\u03fc\u03fb\3\2\2\2\u03fd\u03fe\3\2\2"+
		"\2\u03fe\u03fc\3\2\2\2\u03fe\u03ff\3\2\2\2\u03ff\u0402\3\2\2\2\u0400\u0401"+
		"\7L\2\2\u0401\u0403\5:\36\2\u0402\u0400\3\2\2\2\u0402\u0403\3\2\2\2\u0403"+
		"\u0404\3\2\2\2\u0404\u0405\7M\2\2\u0405\u045b\3\2\2\2\u0406\u0407\7{\2"+
		"\2\u0407\u0408\7\4\2\2\u0408\u0409\5:\36\2\u0409\u040a\7\16\2\2\u040a"+
		"\u040b\5P)\2\u040b\u040c\7\6\2\2\u040c\u045b\3\2\2\2\u040d\u040e\7|\2"+
		"\2\u040e\u040f\7\4\2\2\u040f\u0410\5:\36\2\u0410\u0411\7\16\2\2\u0411"+
		"\u0412\5P)\2\u0412\u0413\7\6\2\2\u0413\u045b\3\2\2\2\u0414\u0415\7\u0095"+
		"\2\2\u0415\u041e\7\b\2\2\u0416\u041b\5:\36\2\u0417\u0418\7\5\2\2\u0418"+
		"\u041a\5:\36\2\u0419\u0417\3\2\2\2\u041a\u041d\3\2\2\2\u041b\u0419\3\2"+
		"\2\2\u041b\u041c\3\2\2\2\u041c\u041f\3\2\2\2\u041d\u041b\3\2\2\2\u041e"+
		"\u0416\3\2\2\2\u041e\u041f\3\2\2\2\u041f\u0420\3\2\2\2\u0420\u045b\7\t"+
		"\2\2\u0421\u045b\5j\66\2\u0422\u045b\7C\2\2\u0423\u0427\7D\2\2\u0424\u0425"+
		"\7\4\2\2\u0425\u0426\7\u00c3\2\2\u0426\u0428\7\6\2\2\u0427\u0424\3\2\2"+
		"\2\u0427\u0428\3\2\2\2\u0428\u045b\3\2\2\2\u0429\u042d\7E\2\2\u042a\u042b"+
		"\7\4\2\2\u042b\u042c\7\u00c3\2\2\u042c\u042e\7\6\2\2\u042d\u042a\3\2\2"+
		"\2\u042d\u042e\3\2\2\2\u042e\u045b\3\2\2\2\u042f\u0433\7F\2\2\u0430\u0431"+
		"\7\4\2\2\u0431\u0432\7\u00c3\2\2\u0432\u0434\7\6\2\2\u0433\u0430\3\2\2"+
		"\2\u0433\u0434\3\2\2\2\u0434\u045b\3\2\2\2\u0435\u0439\7G\2\2\u0436\u0437"+
		"\7\4\2\2\u0437\u0438\7\u00c3\2\2\u0438\u043a\7\6\2\2\u0439\u0436\3\2\2"+
		"\2\u0439\u043a\3\2\2\2\u043a\u045b\3\2\2\2\u043b\u043c\7\62\2\2\u043c"+
		"\u043d\7\4\2\2\u043d\u043e\5B\"\2\u043e\u043f\7\f\2\2\u043f\u0442\5B\""+
		"\2\u0440\u0441\7\64\2\2\u0441\u0443\5B\"\2\u0442\u0440\3\2\2\2\u0442\u0443"+
		"\3\2\2\2\u0443\u0444\3\2\2\2\u0444\u0445\7\6\2\2\u0445\u045b\3\2\2\2\u0446"+
		"\u0447\7\u00ad\2\2\u0447\u0448\7\4\2\2\u0448\u044b\5B\"\2\u0449\u044a"+
		"\7\5\2\2\u044a\u044c\5r:\2\u044b\u0449\3\2\2\2\u044b\u044c\3\2\2\2\u044c"+
		"\u044d\3\2\2\2\u044d\u044e\7\6\2\2\u044e\u045b\3\2\2\2\u044f\u0450\7H"+
		"\2\2\u0450\u0451\7\4\2\2\u0451\u0452\5j\66\2\u0452\u0453\7\f\2\2\u0453"+
		"\u0454\5B\"\2\u0454\u0455\7\6\2\2\u0455\u045b\3\2\2\2\u0456\u0457\7\4"+
		"\2\2\u0457\u0458\5:\36\2\u0458\u0459\7\6\2\2\u0459\u045b\3\2\2\2\u045a"+
		"\u0397\3\2\2\2\u045a\u0399\3\2\2\2\u045a\u039a\3\2\2\2\u045a\u039d\3\2"+
		"\2\2\u045a\u039e\3\2\2\2\u045a\u039f\3\2\2\2\u045a\u03a0\3\2\2\2\u045a"+
		"\u03a1\3\2\2\2\u045a\u03a8\3\2\2\2\u045a\u03b2\3\2\2\2\u045a\u03be\3\2"+
		"\2\2\u045a\u03c5\3\2\2\2\u045a\u03d8\3\2\2\2\u045a\u03dc\3\2\2\2\u045a"+
		"\u03e9\3\2\2\2\u045a\u03ed\3\2\2\2\u045a\u03fa\3\2\2\2\u045a\u0406\3\2"+
		"\2\2\u045a\u040d\3\2\2\2\u045a\u0414\3\2\2\2\u045a\u0421\3\2\2\2\u045a"+
		"\u0422\3\2\2\2\u045a\u0423\3\2\2\2\u045a\u0429\3\2\2\2\u045a\u042f\3\2"+
		"\2\2\u045a\u0435\3\2\2\2\u045a\u043b\3\2\2\2\u045a\u0446\3\2\2\2\u045a"+
		"\u044f\3\2\2\2\u045a\u0456\3\2\2\2\u045b\u0466\3\2\2\2\u045c\u045d\f\16"+
		"\2\2\u045d\u045e\7\b\2\2\u045e\u045f\5B\"\2\u045f\u0460\7\t\2\2\u0460"+
		"\u0465\3\2\2\2\u0461\u0462\f\f\2\2\u0462\u0463\7\3\2\2\u0463\u0465\5j"+
		"\66\2\u0464\u045c\3\2\2\2\u0464\u0461\3\2\2\2\u0465\u0468\3\2\2\2\u0466"+
		"\u0464\3\2\2\2\u0466\u0467\3\2\2\2\u0467E\3\2\2\2\u0468\u0466\3\2\2\2"+
		"\u0469\u046a\79\2\2\u046a\u046b\7B\2\2\u046b\u0470\5L\'\2\u046c\u046d"+
		"\79\2\2\u046d\u046e\7B\2\2\u046e\u0470\7\u00c1\2\2\u046f\u0469\3\2\2\2"+
		"\u046f\u046c\3\2\2\2\u0470G\3\2\2\2\u0471\u0472\t\13\2\2\u0472I\3\2\2"+
		"\2\u0473\u0474\t\f\2\2\u0474K\3\2\2\2\u0475\u0477\7;\2\2\u0476\u0478\t"+
		"\t\2\2\u0477\u0476\3\2\2\2\u0477\u0478\3\2\2\2\u0478\u0479\3\2\2\2\u0479"+
		"\u047a\7\u00c1\2\2\u047a\u047d\5N(\2\u047b\u047c\7\u008a\2\2\u047c\u047e"+
		"\5N(\2\u047d\u047b\3\2\2\2\u047d\u047e\3\2\2\2\u047eM\3\2\2\2\u047f\u0480"+
		"\t\r\2\2\u0480O\3\2\2\2\u0481\u0482\b)\1\2\u0482\u0483\7\u0095\2\2\u0483"+
		"\u0484\7\u00b7\2\2\u0484\u0485\5P)\2\u0485\u0486\7\u00b9\2\2\u0486\u04ac"+
		"\3\2\2\2\u0487\u0488\7\u0096\2\2\u0488\u0489\7\u00b7\2\2\u0489\u048a\5"+
		"P)\2\u048a\u048b\7\5\2\2\u048b\u048c\5P)\2\u048c\u048d\7\u00b9\2\2\u048d"+
		"\u04ac\3\2\2\2\u048e\u048f\7`\2\2\u048f\u0490\7\4\2\2\u0490\u0491\5j\66"+
		"\2\u0491\u0498\5P)\2\u0492\u0493\7\5\2\2\u0493\u0494\5j\66\2\u0494\u0495"+
		"\5P)\2\u0495\u0497\3\2\2\2\u0496\u0492\3\2\2\2\u0497\u049a\3\2\2\2\u0498"+
		"\u0496\3\2\2\2\u0498\u0499\3\2\2\2\u0499\u049b\3\2\2\2\u049a\u0498\3\2"+
		"\2\2\u049b\u049c\7\6\2\2\u049c\u04ac\3\2\2\2\u049d\u04a9\5T+\2\u049e\u049f"+
		"\7\4\2\2\u049f\u04a4\5R*\2\u04a0\u04a1\7\5\2\2\u04a1\u04a3\5R*\2\u04a2"+
		"\u04a0\3\2\2\2\u04a3\u04a6\3\2\2\2\u04a4\u04a2\3\2\2\2\u04a4\u04a5\3\2"+
		"\2\2\u04a5\u04a7\3\2\2\2\u04a6\u04a4\3\2\2\2\u04a7\u04a8\7\6\2\2\u04a8"+
		"\u04aa\3\2\2\2\u04a9\u049e\3\2\2\2\u04a9\u04aa\3\2\2\2\u04aa\u04ac\3\2"+
		"\2\2\u04ab\u0481\3\2\2\2\u04ab\u0487\3\2\2\2\u04ab\u048e\3\2\2\2\u04ab"+
		"\u049d\3\2\2\2\u04ac\u04b1\3\2\2\2\u04ad\u04ae\f\7\2\2\u04ae\u04b0\7\u0095"+
		"\2\2\u04af\u04ad\3\2\2\2\u04b0\u04b3\3\2\2\2\u04b1\u04af\3\2\2\2\u04b1"+
		"\u04b2\3\2\2\2\u04b2Q\3\2\2\2\u04b3\u04b1\3\2\2\2\u04b4\u04b7\7\u00c3"+
		"\2\2\u04b5\u04b7\5P)\2\u04b6\u04b4\3\2\2\2\u04b6\u04b5\3\2\2\2\u04b7S"+
		"\3\2\2\2\u04b8\u04bc\7\u00c9\2\2\u04b9\u04bc\7\u00ca\2\2\u04ba\u04bc\5"+
		"j\66\2\u04bb\u04b8\3\2\2\2\u04bb\u04b9\3\2\2\2\u04bb\u04ba\3\2\2\2\u04bc"+
		"U\3\2\2\2\u04bd\u04be\7J\2\2\u04be\u04bf\5:\36\2\u04bf\u04c0\7K\2\2\u04c0"+
		"\u04c1\5:\36\2\u04c1W\3\2\2\2\u04c2\u04c3\7X\2\2\u04c3\u04ce\7\4\2\2\u04c4"+
		"\u04c5\7Y\2\2\u04c5\u04c6\7\25\2\2\u04c6\u04cb\5:\36\2\u04c7\u04c8\7\5"+
		"\2\2\u04c8\u04ca\5:\36\2\u04c9\u04c7\3\2\2\2\u04ca\u04cd\3\2\2\2\u04cb"+
		"\u04c9\3\2\2\2\u04cb\u04cc\3\2\2\2\u04cc\u04cf\3\2\2\2\u04cd\u04cb\3\2"+
		"\2\2\u04ce\u04c4\3\2\2\2\u04ce\u04cf\3\2\2\2\u04cf\u04da\3\2\2\2\u04d0"+
		"\u04d1\7\32\2\2\u04d1\u04d2\7\25\2\2\u04d2\u04d7\5\30\r\2\u04d3\u04d4"+
		"\7\5\2\2\u04d4\u04d6\5\30\r\2\u04d5\u04d3\3\2\2\2\u04d6\u04d9\3\2\2\2"+
		"\u04d7\u04d5\3\2\2\2\u04d7\u04d8\3\2\2\2\u04d8\u04db\3\2\2\2\u04d9\u04d7"+
		"\3\2\2\2\u04da\u04d0\3\2\2\2\u04da\u04db\3\2\2\2\u04db\u04dd\3\2\2\2\u04dc"+
		"\u04de\5Z.\2\u04dd\u04dc\3\2\2\2\u04dd\u04de\3\2\2\2\u04de\u04df\3\2\2"+
		"\2\u04df\u04e0\7\6\2\2\u04e0Y\3\2\2\2\u04e1\u04e2\7Z\2\2\u04e2\u04f2\5"+
		"\\/\2\u04e3\u04e4\7[\2\2\u04e4\u04f2\5\\/\2\u04e5\u04e6\7Z\2\2\u04e6\u04e7"+
		"\7&\2\2\u04e7\u04e8\5\\/\2\u04e8\u04e9\7!\2\2\u04e9\u04ea\5\\/\2\u04ea"+
		"\u04f2\3\2\2\2\u04eb\u04ec\7[\2\2\u04ec\u04ed\7&\2\2\u04ed\u04ee\5\\/"+
		"\2\u04ee\u04ef\7!\2\2\u04ef\u04f0\5\\/\2\u04f0\u04f2\3\2\2\2\u04f1\u04e1"+
		"\3\2\2\2\u04f1\u04e3\3\2\2\2\u04f1\u04e5\3\2\2\2\u04f1\u04eb\3\2\2\2\u04f2"+
		"[\3\2\2\2\u04f3\u04f4\7\\\2\2\u04f4\u04fd\7]\2\2\u04f5\u04f6\7\\\2\2\u04f6"+
		"\u04fd\7^\2\2\u04f7\u04f8\7_\2\2\u04f8\u04fd\7`\2\2\u04f9\u04fa\5:\36"+
		"\2\u04fa\u04fb\t\16\2\2\u04fb\u04fd\3\2\2\2\u04fc\u04f3\3\2\2\2\u04fc"+
		"\u04f5\3\2\2\2\u04fc\u04f7\3\2\2\2\u04fc\u04f9\3\2\2\2\u04fd]\3\2\2\2"+
		"\u04fe\u04ff\7t\2\2\u04ff\u0503\t\17\2\2\u0500\u0501\7u\2\2\u0501\u0503"+
		"\t\20\2\2\u0502\u04fe\3\2\2\2\u0502\u0500\3\2\2\2\u0503_\3\2\2\2\u0504"+
		"\u0505\7\u00a0\2\2\u0505\u0506\7\u00a1\2\2\u0506\u050a\5b\62\2\u0507\u0508"+
		"\7\u00a6\2\2\u0508\u050a\t\21\2\2\u0509\u0504\3\2\2\2\u0509\u0507\3\2"+
		"\2\2\u050aa\3\2\2\2\u050b\u050c\7\u00a6\2\2\u050c\u0513\7\u00a5\2\2\u050d"+
		"\u050e\7\u00a6\2\2\u050e\u0513\7\u00a4\2\2\u050f\u0510\7\u00a3\2\2\u0510"+
		"\u0513\7\u00a6\2\2\u0511\u0513\7\u00a2\2\2\u0512\u050b\3\2\2\2\u0512\u050d"+
		"\3\2\2\2\u0512\u050f\3\2\2\2\u0512\u0511\3\2\2\2\u0513c\3\2\2\2\u0514"+
		"\u051a\5:\36\2\u0515\u0516\5j\66\2\u0516\u0517\7\n\2\2\u0517\u0518\5:"+
		"\36\2\u0518\u051a\3\2\2\2\u0519\u0514\3\2\2\2\u0519\u0515\3\2\2\2\u051a"+
		"e\3\2\2\2\u051b\u0520\7\13\2\2\u051c\u0520\7i\2\2\u051d\u0520\7h\2\2\u051e"+
		"\u0520\5j\66\2\u051f\u051b\3\2\2\2\u051f\u051c\3\2\2\2\u051f\u051d\3\2"+
		"\2\2\u051f\u051e\3\2\2\2\u0520g\3\2\2\2\u0521\u0526\5j\66\2\u0522\u0523"+
		"\7\3\2\2\u0523\u0525\5j\66\2\u0524\u0522\3\2\2\2\u0525\u0528\3\2\2\2\u0526"+
		"\u0524\3\2\2\2\u0526\u0527\3\2\2\2\u0527i\3\2\2\2\u0528\u0526\3\2\2\2"+
		"\u0529\u052f\7\u00c5\2\2\u052a\u052f\5l\67\2\u052b\u052f\5p9\2\u052c\u052f"+
		"\7\u00c8\2\2\u052d\u052f\7\u00c6\2\2\u052e\u0529\3\2\2\2\u052e\u052a\3"+
		"\2\2\2\u052e\u052b\3\2\2\2\u052e\u052c\3\2\2\2\u052e\u052d\3\2\2\2\u052f"+
		"k\3\2\2\2\u0530\u0531\7\u00c7\2\2\u0531m\3\2\2\2\u0532\u0535\7\u00c4\2"+
		"\2\u0533\u0535\7\u00c3\2\2\u0534\u0532\3\2\2\2\u0534\u0533\3\2\2\2\u0535"+
		"o\3\2\2\2\u0536\u058c\7}\2\2\u0537\u058c\7~\2\2\u0538\u058c\7\u0081\2"+
		"\2\u0539\u058c\7\u0082\2\2\u053a\u058c\7\u0084\2\2\u053b\u058c\7\u0085"+
		"\2\2\u053c\u058c\7\177\2\2\u053d\u058c\7\u0080\2\2\u053e\u058c\7\u0099"+
		"\2\2\u053f\u058c\7\r\2\2\u0540\u058c\7X\2\2\u0541\u058c\7Y\2\2\u0542\u058c"+
		"\7Z\2\2\u0543\u058c\7[\2\2\u0544\u058c\7]\2\2\u0545\u058c\7^\2\2\u0546"+
		"\u058c\7_\2\2\u0547\u058c\7`\2\2\u0548\u058c\7\u0096\2\2\u0549\u058c\7"+
		"\u0095\2\2\u054a\u058c\7\65\2\2\u054b\u058c\7\66\2\2\u054c\u058c\7\67"+
		"\2\2\u054d\u058c\78\2\2\u054e\u058c\79\2\2\u054f\u058c\7:\2\2\u0550\u058c"+
		"\7;\2\2\u0551\u058c\7B\2\2\u0552\u058c\7<\2\2\u0553\u058c\7=\2\2\u0554"+
		"\u058c\7>\2\2\u0555\u058c\7?\2\2\u0556\u058c\7@\2\2\u0557\u058c\7A\2\2"+
		"\u0558\u058c\7r\2\2\u0559\u058c\7s\2\2\u055a\u058c\7t\2\2\u055b\u058c"+
		"\7u\2\2\u055c\u058c\7v\2\2\u055d\u058c\7w\2\2\u055e\u058c\7x\2\2\u055f"+
		"\u058c\7y\2\2\u0560\u058c\7\u008e\2\2\u0561\u058c\7\u008b\2\2\u0562\u058c"+
		"\7\u008c\2\2\u0563\u058c\7\u008d\2\2\u0564\u058c\7\u0083\2\2\u0565\u058c"+
		"\7\u008a\2\2\u0566\u058c\7\u008f\2\2\u0567\u058c\7\35\2\2\u0568\u058c"+
		"\7\36\2\2\u0569\u058c\7\37\2\2\u056a\u058c\7\u0097\2\2\u056b\u058c\7\u0098"+
		"\2\2\u056c\u058c\7f\2\2\u056d\u058c\7g\2\2\u056e\u058c\7\u00b2\2\2\u056f"+
		"\u058c\7\u00b3\2\2\u0570\u058c\7\u00b4\2\2\u0571\u058c\7z\2\2\u0572\u058c"+
		"\5r:\2\u0573\u058c\7\63\2\2\u0574\u058c\7$\2\2\u0575\u058c\7\u009a\2\2"+
		"\u0576\u058c\7\u009b\2\2\u0577\u058c\7\u009c\2\2\u0578\u058c\7\u009d\2"+
		"\2\u0579\u058c\7\u009e\2\2\u057a\u058c\7\u009f\2\2\u057b\u058c\7\u00a0"+
		"\2\2\u057c\u058c\7\u00a1\2\2\u057d\u058c\7\u00a2\2\2\u057e\u058c\7\u00a3"+
		"\2\2\u057f\u058c\7\u00a4\2\2\u0580\u058c\7\u00a5\2\2\u0581\u058c\7\u00a6"+
		"\2\2\u0582\u058c\7\u00a7\2\2\u0583\u058c\7\u00a8\2\2\u0584\u058c\7\u00a9"+
		"\2\2\u0585\u058c\7m\2\2\u0586\u058c\7n\2\2\u0587\u058c\7o\2\2\u0588\u058c"+
		"\7p\2\2\u0589\u058c\7q\2\2\u058a\u058c\7\62\2\2\u058b\u0536\3\2\2\2\u058b"+
		"\u0537\3\2\2\2\u058b\u0538\3\2\2\2\u058b\u0539\3\2\2\2\u058b\u053a\3\2"+
		"\2\2\u058b\u053b\3\2\2\2\u058b\u053c\3\2\2\2\u058b\u053d\3\2\2\2\u058b"+
		"\u053e\3\2\2\2\u058b\u053f\3\2\2\2\u058b\u0540\3\2\2\2\u058b\u0541\3\2"+
		"\2\2\u058b\u0542\3\2\2\2\u058b\u0543\3\2\2\2\u058b\u0544\3\2\2\2\u058b"+
		"\u0545\3\2\2\2\u058b\u0546\3\2\2\2\u058b\u0547\3\2\2\2\u058b\u0548\3\2"+
		"\2\2\u058b\u0549\3\2\2\2\u058b\u054a\3\2\2\2\u058b\u054b\3\2\2\2\u058b"+
		"\u054c\3\2\2\2\u058b\u054d\3\2\2\2\u058b\u054e\3\2\2\2\u058b\u054f\3\2"+
		"\2\2\u058b\u0550\3\2\2\2\u058b\u0551\3\2\2\2\u058b\u0552\3\2\2\2\u058b"+
		"\u0553\3\2\2\2\u058b\u0554\3\2\2\2\u058b\u0555\3\2\2\2\u058b\u0556\3\2"+
		"\2\2\u058b\u0557\3\2\2\2\u058b\u0558\3\2\2\2\u058b\u0559\3\2\2\2\u058b"+
		"\u055a\3\2\2\2\u058b\u055b\3\2\2\2\u058b\u055c\3\2\2\2\u058b\u055d\3\2"+
		"\2\2\u058b\u055e\3\2\2\2\u058b\u055f\3\2\2\2\u058b\u0560\3\2\2\2\u058b"+
		"\u0561\3\2\2\2\u058b\u0562\3\2\2\2\u058b\u0563\3\2\2\2\u058b\u0564\3\2"+
		"\2\2\u058b\u0565\3\2\2\2\u058b\u0566\3\2\2\2\u058b\u0567\3\2\2\2\u058b"+
		"\u0568\3\2\2\2\u058b\u0569\3\2\2\2\u058b\u056a\3\2\2\2\u058b\u056b\3\2"+
		"\2\2\u058b\u056c\3\2\2\2\u058b\u056d\3\2\2\2\u058b\u056e\3\2\2\2\u058b"+
		"\u056f\3\2\2\2\u058b\u0570\3\2\2\2\u058b\u0571\3\2\2\2\u058b\u0572\3\2"+
		"\2\2\u058b\u0573\3\2\2\2\u058b\u0574\3\2\2\2\u058b\u0575\3\2\2\2\u058b"+
		"\u0576\3\2\2\2\u058b\u0577\3\2\2\2\u058b\u0578\3\2\2\2\u058b\u0579\3\2"+
		"\2\2\u058b\u057a\3\2\2\2\u058b\u057b\3\2\2\2\u058b\u057c\3\2\2\2\u058b"+
		"\u057d\3\2\2\2\u058b\u057e\3\2\2\2\u058b\u057f\3\2\2\2\u058b\u0580\3\2"+
		"\2\2\u058b\u0581\3\2\2\2\u058b\u0582\3\2\2\2\u058b\u0583\3\2\2\2\u058b"+
		"\u0584\3\2\2\2\u058b\u0585\3\2\2\2\u058b\u0586\3\2\2\2\u058b\u0587\3\2"+
		"\2\2\u058b\u0588\3\2\2\2\u058b\u0589\3\2\2\2\u058b\u058a\3\2\2\2\u058c"+
		"q\3\2\2\2\u058d\u058e\t\22\2\2\u058es\3\2\2\2\u00a7\u0087\u008c\u0092"+
		"\u0095\u009c\u00a5\u00ab\u00b1\u00b8\u00c1\u00dd\u00e8\u00f3\u00f6\u0100"+
		"\u0105\u0109\u0111\u0117\u011e\u0123\u0127\u012f\u0137\u013c\u014b\u014f"+
		"\u0155\u0159\u015f\u017d\u0180\u0184\u0188\u0190\u0199\u019c\u01a0\u01ac"+
		"\u01af\u01b5\u01bc\u01c8\u01d9\u01dc\u01e0\u01e7\u01ef\u01f5\u01f8\u01fa"+
		"\u0206\u020d\u0211\u0215\u0219\u0220\u0229\u022c\u0230\u0235\u0239\u023c"+
		"\u0243\u024e\u0251\u025b\u025e\u0269\u026e\u0276\u0279\u027d\u0285\u0288"+
		"\u028c\u0290\u029b\u029e\u02a5\u02b8\u02bc\u02c0\u02c4\u02c8\u02cc\u02ce"+
		"\u02d9\u02de\u02e7\u02f1\u02f6\u02f8\u02fe\u0302\u0304\u030c\u031d\u0323"+
		"\u0329\u0336\u033e\u0340\u0345\u034b\u0353\u035c\u0362\u036a\u0370\u0374"+
		"\u0379\u037e\u0384\u0392\u0394\u03ae\u03b9\u03c3\u03c8\u03cf\u03d2\u03d6"+
		"\u03e2\u03f2\u03f6\u03fe\u0402\u041b\u041e\u0427\u042d\u0433\u0439\u0442"+
		"\u044b\u045a\u0464\u0466\u046f\u0477\u047d\u0498\u04a4\u04a9\u04ab\u04b1"+
		"\u04b6\u04bb\u04cb\u04ce\u04d7\u04da\u04dd\u04f1\u04fc\u0502\u0509\u0512"+
		"\u0519\u051f\u0526\u052e\u0534\u058b";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}