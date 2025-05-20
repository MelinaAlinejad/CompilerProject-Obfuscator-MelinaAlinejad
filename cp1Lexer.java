// $ANTLR 3.5.1 C:\\Users\\aminnet\\Desktop\\p1\\cp1.g 2025-05-20 20:06:56

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class cp1Lexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__27=27;
	public static final int T__28=28;
	public static final int T__29=29;
	public static final int T__30=30;
	public static final int T__31=31;
	public static final int T__32=32;
	public static final int T__33=33;
	public static final int ASSIGN=4;
	public static final int COMMA=5;
	public static final int COMMENT=6;
	public static final int DIV=7;
	public static final int EQ=8;
	public static final int FLOAT=9;
	public static final int GE=10;
	public static final int GT=11;
	public static final int ID=12;
	public static final int INT=13;
	public static final int LBRACE=14;
	public static final int LE=15;
	public static final int LPAREN=16;
	public static final int LT=17;
	public static final int MINUS=18;
	public static final int MUL=19;
	public static final int MULTICOMMENT=20;
	public static final int NE=21;
	public static final int PLUS=22;
	public static final int RBRACE=23;
	public static final int RPAREN=24;
	public static final int SEMI=25;
	public static final int WS=26;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public cp1Lexer() {} 
	public cp1Lexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public cp1Lexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "C:\\Users\\aminnet\\Desktop\\p1\\cp1.g"; }

	// $ANTLR start "T__27"
	public final void mT__27() throws RecognitionException {
		try {
			int _type = T__27;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\aminnet\\Desktop\\p1\\cp1.g:7:7: ( 'else' )
			// C:\\Users\\aminnet\\Desktop\\p1\\cp1.g:7:9: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__27"

	// $ANTLR start "T__28"
	public final void mT__28() throws RecognitionException {
		try {
			int _type = T__28;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\aminnet\\Desktop\\p1\\cp1.g:8:7: ( 'float' )
			// C:\\Users\\aminnet\\Desktop\\p1\\cp1.g:8:9: 'float'
			{
			match("float"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__28"

	// $ANTLR start "T__29"
	public final void mT__29() throws RecognitionException {
		try {
			int _type = T__29;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\aminnet\\Desktop\\p1\\cp1.g:9:7: ( 'if' )
			// C:\\Users\\aminnet\\Desktop\\p1\\cp1.g:9:9: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__29"

	// $ANTLR start "T__30"
	public final void mT__30() throws RecognitionException {
		try {
			int _type = T__30;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\aminnet\\Desktop\\p1\\cp1.g:10:7: ( 'int' )
			// C:\\Users\\aminnet\\Desktop\\p1\\cp1.g:10:9: 'int'
			{
			match("int"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__30"

	// $ANTLR start "T__31"
	public final void mT__31() throws RecognitionException {
		try {
			int _type = T__31;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\aminnet\\Desktop\\p1\\cp1.g:11:7: ( 'return' )
			// C:\\Users\\aminnet\\Desktop\\p1\\cp1.g:11:9: 'return'
			{
			match("return"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__31"

	// $ANTLR start "T__32"
	public final void mT__32() throws RecognitionException {
		try {
			int _type = T__32;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\aminnet\\Desktop\\p1\\cp1.g:12:7: ( 'void' )
			// C:\\Users\\aminnet\\Desktop\\p1\\cp1.g:12:9: 'void'
			{
			match("void"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__32"

	// $ANTLR start "T__33"
	public final void mT__33() throws RecognitionException {
		try {
			int _type = T__33;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\aminnet\\Desktop\\p1\\cp1.g:13:7: ( 'while' )
			// C:\\Users\\aminnet\\Desktop\\p1\\cp1.g:13:9: 'while'
			{
			match("while"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__33"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\aminnet\\Desktop\\p1\\cp1.g:110:9: ( ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
			// C:\\Users\\aminnet\\Desktop\\p1\\cp1.g:110:11: ( 'a' .. 'z' | 'A' .. 'Z' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			// C:\\Users\\aminnet\\Desktop\\p1\\cp1.g:110:33: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\aminnet\\Desktop\\p1\\cp1.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop1;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	// $ANTLR start "INT"
	public final void mINT() throws RecognitionException {
		try {
			int _type = INT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\aminnet\\Desktop\\p1\\cp1.g:111:9: ( ( '0' .. '9' )+ )
			// C:\\Users\\aminnet\\Desktop\\p1\\cp1.g:111:11: ( '0' .. '9' )+
			{
			// C:\\Users\\aminnet\\Desktop\\p1\\cp1.g:111:11: ( '0' .. '9' )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Users\\aminnet\\Desktop\\p1\\cp1.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "INT"

	// $ANTLR start "FLOAT"
	public final void mFLOAT() throws RecognitionException {
		try {
			int _type = FLOAT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\aminnet\\Desktop\\p1\\cp1.g:112:9: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* )
			// C:\\Users\\aminnet\\Desktop\\p1\\cp1.g:112:11: ( '0' .. '9' )+ '.' ( '0' .. '9' )*
			{
			// C:\\Users\\aminnet\\Desktop\\p1\\cp1.g:112:11: ( '0' .. '9' )+
			int cnt3=0;
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// C:\\Users\\aminnet\\Desktop\\p1\\cp1.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt3 >= 1 ) break loop3;
					EarlyExitException eee = new EarlyExitException(3, input);
					throw eee;
				}
				cnt3++;
			}

			match('.'); 
			// C:\\Users\\aminnet\\Desktop\\p1\\cp1.g:112:27: ( '0' .. '9' )*
			loop4:
			while (true) {
				int alt4=2;
				int LA4_0 = input.LA(1);
				if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
					alt4=1;
				}

				switch (alt4) {
				case 1 :
					// C:\\Users\\aminnet\\Desktop\\p1\\cp1.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop4;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FLOAT"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\aminnet\\Desktop\\p1\\cp1.g:113:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
			// C:\\Users\\aminnet\\Desktop\\p1\\cp1.g:113:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
			{
			// C:\\Users\\aminnet\\Desktop\\p1\\cp1.g:113:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
			int cnt5=0;
			loop5:
			while (true) {
				int alt5=2;
				int LA5_0 = input.LA(1);
				if ( ((LA5_0 >= '\t' && LA5_0 <= '\n')||LA5_0=='\r'||LA5_0==' ') ) {
					alt5=1;
				}

				switch (alt5) {
				case 1 :
					// C:\\Users\\aminnet\\Desktop\\p1\\cp1.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt5 >= 1 ) break loop5;
					EarlyExitException eee = new EarlyExitException(5, input);
					throw eee;
				}
				cnt5++;
			}

			skip();
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "COMMENT"
	public final void mCOMMENT() throws RecognitionException {
		try {
			int _type = COMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\aminnet\\Desktop\\p1\\cp1.g:114:9: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
			// C:\\Users\\aminnet\\Desktop\\p1\\cp1.g:114:11: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
			{
			match("//"); 

			// C:\\Users\\aminnet\\Desktop\\p1\\cp1.g:114:16: (~ ( '\\n' | '\\r' ) )*
			loop6:
			while (true) {
				int alt6=2;
				int LA6_0 = input.LA(1);
				if ( ((LA6_0 >= '\u0000' && LA6_0 <= '\t')||(LA6_0 >= '\u000B' && LA6_0 <= '\f')||(LA6_0 >= '\u000E' && LA6_0 <= '\uFFFF')) ) {
					alt6=1;
				}

				switch (alt6) {
				case 1 :
					// C:\\Users\\aminnet\\Desktop\\p1\\cp1.g:
					{
					if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop6;
				}
			}

			// C:\\Users\\aminnet\\Desktop\\p1\\cp1.g:114:30: ( '\\r' )?
			int alt7=2;
			int LA7_0 = input.LA(1);
			if ( (LA7_0=='\r') ) {
				alt7=1;
			}
			switch (alt7) {
				case 1 :
					// C:\\Users\\aminnet\\Desktop\\p1\\cp1.g:114:30: '\\r'
					{
					match('\r'); 
					}
					break;

			}

			match('\n'); 
			skip();
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMENT"

	// $ANTLR start "MULTICOMMENT"
	public final void mMULTICOMMENT() throws RecognitionException {
		try {
			int _type = MULTICOMMENT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\aminnet\\Desktop\\p1\\cp1.g:115:14: ( '/*' ( . )* '*/' )
			// C:\\Users\\aminnet\\Desktop\\p1\\cp1.g:115:16: '/*' ( . )* '*/'
			{
			match("/*"); 

			// C:\\Users\\aminnet\\Desktop\\p1\\cp1.g:115:21: ( . )*
			loop8:
			while (true) {
				int alt8=2;
				int LA8_0 = input.LA(1);
				if ( (LA8_0=='*') ) {
					int LA8_1 = input.LA(2);
					if ( (LA8_1=='/') ) {
						alt8=2;
					}
					else if ( ((LA8_1 >= '\u0000' && LA8_1 <= '.')||(LA8_1 >= '0' && LA8_1 <= '\uFFFF')) ) {
						alt8=1;
					}

				}
				else if ( ((LA8_0 >= '\u0000' && LA8_0 <= ')')||(LA8_0 >= '+' && LA8_0 <= '\uFFFF')) ) {
					alt8=1;
				}

				switch (alt8) {
				case 1 :
					// C:\\Users\\aminnet\\Desktop\\p1\\cp1.g:115:21: .
					{
					matchAny(); 
					}
					break;

				default :
					break loop8;
				}
			}

			match("*/"); 

			skip();
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MULTICOMMENT"

	// $ANTLR start "PLUS"
	public final void mPLUS() throws RecognitionException {
		try {
			int _type = PLUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\aminnet\\Desktop\\p1\\cp1.g:117:9: ( '+' )
			// C:\\Users\\aminnet\\Desktop\\p1\\cp1.g:117:11: '+'
			{
			match('+'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "PLUS"

	// $ANTLR start "MINUS"
	public final void mMINUS() throws RecognitionException {
		try {
			int _type = MINUS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\aminnet\\Desktop\\p1\\cp1.g:118:9: ( '-' )
			// C:\\Users\\aminnet\\Desktop\\p1\\cp1.g:118:11: '-'
			{
			match('-'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MINUS"

	// $ANTLR start "MUL"
	public final void mMUL() throws RecognitionException {
		try {
			int _type = MUL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\aminnet\\Desktop\\p1\\cp1.g:119:9: ( '*' )
			// C:\\Users\\aminnet\\Desktop\\p1\\cp1.g:119:11: '*'
			{
			match('*'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MUL"

	// $ANTLR start "DIV"
	public final void mDIV() throws RecognitionException {
		try {
			int _type = DIV;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\aminnet\\Desktop\\p1\\cp1.g:120:9: ( '/' )
			// C:\\Users\\aminnet\\Desktop\\p1\\cp1.g:120:11: '/'
			{
			match('/'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIV"

	// $ANTLR start "EQ"
	public final void mEQ() throws RecognitionException {
		try {
			int _type = EQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\aminnet\\Desktop\\p1\\cp1.g:121:9: ( '==' )
			// C:\\Users\\aminnet\\Desktop\\p1\\cp1.g:121:11: '=='
			{
			match("=="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EQ"

	// $ANTLR start "ASSIGN"
	public final void mASSIGN() throws RecognitionException {
		try {
			int _type = ASSIGN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\aminnet\\Desktop\\p1\\cp1.g:122:9: ( '=' )
			// C:\\Users\\aminnet\\Desktop\\p1\\cp1.g:122:11: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ASSIGN"

	// $ANTLR start "NE"
	public final void mNE() throws RecognitionException {
		try {
			int _type = NE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\aminnet\\Desktop\\p1\\cp1.g:123:9: ( '!=' )
			// C:\\Users\\aminnet\\Desktop\\p1\\cp1.g:123:11: '!='
			{
			match("!="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NE"

	// $ANTLR start "LT"
	public final void mLT() throws RecognitionException {
		try {
			int _type = LT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\aminnet\\Desktop\\p1\\cp1.g:124:9: ( '<' )
			// C:\\Users\\aminnet\\Desktop\\p1\\cp1.g:124:11: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LT"

	// $ANTLR start "GT"
	public final void mGT() throws RecognitionException {
		try {
			int _type = GT;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\aminnet\\Desktop\\p1\\cp1.g:125:9: ( '>' )
			// C:\\Users\\aminnet\\Desktop\\p1\\cp1.g:125:11: '>'
			{
			match('>'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GT"

	// $ANTLR start "LE"
	public final void mLE() throws RecognitionException {
		try {
			int _type = LE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\aminnet\\Desktop\\p1\\cp1.g:126:9: ( '<=' )
			// C:\\Users\\aminnet\\Desktop\\p1\\cp1.g:126:11: '<='
			{
			match("<="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LE"

	// $ANTLR start "GE"
	public final void mGE() throws RecognitionException {
		try {
			int _type = GE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\aminnet\\Desktop\\p1\\cp1.g:127:9: ( '>=' )
			// C:\\Users\\aminnet\\Desktop\\p1\\cp1.g:127:11: '>='
			{
			match(">="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "GE"

	// $ANTLR start "LPAREN"
	public final void mLPAREN() throws RecognitionException {
		try {
			int _type = LPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\aminnet\\Desktop\\p1\\cp1.g:128:9: ( '(' )
			// C:\\Users\\aminnet\\Desktop\\p1\\cp1.g:128:11: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LPAREN"

	// $ANTLR start "RPAREN"
	public final void mRPAREN() throws RecognitionException {
		try {
			int _type = RPAREN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\aminnet\\Desktop\\p1\\cp1.g:129:9: ( ')' )
			// C:\\Users\\aminnet\\Desktop\\p1\\cp1.g:129:11: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RPAREN"

	// $ANTLR start "LBRACE"
	public final void mLBRACE() throws RecognitionException {
		try {
			int _type = LBRACE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\aminnet\\Desktop\\p1\\cp1.g:130:9: ( '{' )
			// C:\\Users\\aminnet\\Desktop\\p1\\cp1.g:130:11: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LBRACE"

	// $ANTLR start "RBRACE"
	public final void mRBRACE() throws RecognitionException {
		try {
			int _type = RBRACE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\aminnet\\Desktop\\p1\\cp1.g:131:9: ( '}' )
			// C:\\Users\\aminnet\\Desktop\\p1\\cp1.g:131:11: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RBRACE"

	// $ANTLR start "SEMI"
	public final void mSEMI() throws RecognitionException {
		try {
			int _type = SEMI;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\aminnet\\Desktop\\p1\\cp1.g:132:9: ( ';' )
			// C:\\Users\\aminnet\\Desktop\\p1\\cp1.g:132:11: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SEMI"

	// $ANTLR start "COMMA"
	public final void mCOMMA() throws RecognitionException {
		try {
			int _type = COMMA;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\aminnet\\Desktop\\p1\\cp1.g:133:9: ( ',' )
			// C:\\Users\\aminnet\\Desktop\\p1\\cp1.g:133:11: ','
			{
			match(','); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "COMMA"

	@Override
	public void mTokens() throws RecognitionException {
		// C:\\Users\\aminnet\\Desktop\\p1\\cp1.g:1:8: ( T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | ID | INT | FLOAT | WS | COMMENT | MULTICOMMENT | PLUS | MINUS | MUL | DIV | EQ | ASSIGN | NE | LT | GT | LE | GE | LPAREN | RPAREN | LBRACE | RBRACE | SEMI | COMMA )
		int alt9=30;
		alt9 = dfa9.predict(input);
		switch (alt9) {
			case 1 :
				// C:\\Users\\aminnet\\Desktop\\p1\\cp1.g:1:10: T__27
				{
				mT__27(); 

				}
				break;
			case 2 :
				// C:\\Users\\aminnet\\Desktop\\p1\\cp1.g:1:16: T__28
				{
				mT__28(); 

				}
				break;
			case 3 :
				// C:\\Users\\aminnet\\Desktop\\p1\\cp1.g:1:22: T__29
				{
				mT__29(); 

				}
				break;
			case 4 :
				// C:\\Users\\aminnet\\Desktop\\p1\\cp1.g:1:28: T__30
				{
				mT__30(); 

				}
				break;
			case 5 :
				// C:\\Users\\aminnet\\Desktop\\p1\\cp1.g:1:34: T__31
				{
				mT__31(); 

				}
				break;
			case 6 :
				// C:\\Users\\aminnet\\Desktop\\p1\\cp1.g:1:40: T__32
				{
				mT__32(); 

				}
				break;
			case 7 :
				// C:\\Users\\aminnet\\Desktop\\p1\\cp1.g:1:46: T__33
				{
				mT__33(); 

				}
				break;
			case 8 :
				// C:\\Users\\aminnet\\Desktop\\p1\\cp1.g:1:52: ID
				{
				mID(); 

				}
				break;
			case 9 :
				// C:\\Users\\aminnet\\Desktop\\p1\\cp1.g:1:55: INT
				{
				mINT(); 

				}
				break;
			case 10 :
				// C:\\Users\\aminnet\\Desktop\\p1\\cp1.g:1:59: FLOAT
				{
				mFLOAT(); 

				}
				break;
			case 11 :
				// C:\\Users\\aminnet\\Desktop\\p1\\cp1.g:1:65: WS
				{
				mWS(); 

				}
				break;
			case 12 :
				// C:\\Users\\aminnet\\Desktop\\p1\\cp1.g:1:68: COMMENT
				{
				mCOMMENT(); 

				}
				break;
			case 13 :
				// C:\\Users\\aminnet\\Desktop\\p1\\cp1.g:1:76: MULTICOMMENT
				{
				mMULTICOMMENT(); 

				}
				break;
			case 14 :
				// C:\\Users\\aminnet\\Desktop\\p1\\cp1.g:1:89: PLUS
				{
				mPLUS(); 

				}
				break;
			case 15 :
				// C:\\Users\\aminnet\\Desktop\\p1\\cp1.g:1:94: MINUS
				{
				mMINUS(); 

				}
				break;
			case 16 :
				// C:\\Users\\aminnet\\Desktop\\p1\\cp1.g:1:100: MUL
				{
				mMUL(); 

				}
				break;
			case 17 :
				// C:\\Users\\aminnet\\Desktop\\p1\\cp1.g:1:104: DIV
				{
				mDIV(); 

				}
				break;
			case 18 :
				// C:\\Users\\aminnet\\Desktop\\p1\\cp1.g:1:108: EQ
				{
				mEQ(); 

				}
				break;
			case 19 :
				// C:\\Users\\aminnet\\Desktop\\p1\\cp1.g:1:111: ASSIGN
				{
				mASSIGN(); 

				}
				break;
			case 20 :
				// C:\\Users\\aminnet\\Desktop\\p1\\cp1.g:1:118: NE
				{
				mNE(); 

				}
				break;
			case 21 :
				// C:\\Users\\aminnet\\Desktop\\p1\\cp1.g:1:121: LT
				{
				mLT(); 

				}
				break;
			case 22 :
				// C:\\Users\\aminnet\\Desktop\\p1\\cp1.g:1:124: GT
				{
				mGT(); 

				}
				break;
			case 23 :
				// C:\\Users\\aminnet\\Desktop\\p1\\cp1.g:1:127: LE
				{
				mLE(); 

				}
				break;
			case 24 :
				// C:\\Users\\aminnet\\Desktop\\p1\\cp1.g:1:130: GE
				{
				mGE(); 

				}
				break;
			case 25 :
				// C:\\Users\\aminnet\\Desktop\\p1\\cp1.g:1:133: LPAREN
				{
				mLPAREN(); 

				}
				break;
			case 26 :
				// C:\\Users\\aminnet\\Desktop\\p1\\cp1.g:1:140: RPAREN
				{
				mRPAREN(); 

				}
				break;
			case 27 :
				// C:\\Users\\aminnet\\Desktop\\p1\\cp1.g:1:147: LBRACE
				{
				mLBRACE(); 

				}
				break;
			case 28 :
				// C:\\Users\\aminnet\\Desktop\\p1\\cp1.g:1:154: RBRACE
				{
				mRBRACE(); 

				}
				break;
			case 29 :
				// C:\\Users\\aminnet\\Desktop\\p1\\cp1.g:1:161: SEMI
				{
				mSEMI(); 

				}
				break;
			case 30 :
				// C:\\Users\\aminnet\\Desktop\\p1\\cp1.g:1:166: COMMA
				{
				mCOMMA(); 

				}
				break;

		}
	}


	protected DFA9 dfa9 = new DFA9(this);
	static final String DFA9_eotS =
		"\1\uffff\6\7\1\uffff\1\37\1\uffff\1\43\3\uffff\1\45\1\uffff\1\47\1\51"+
		"\6\uffff\2\7\1\54\4\7\13\uffff\2\7\1\uffff\1\63\3\7\1\67\1\7\1\uffff\1"+
		"\7\1\72\1\7\1\uffff\1\74\1\7\1\uffff\1\76\1\uffff\1\77\2\uffff";
	static final String DFA9_eofS =
		"\100\uffff";
	static final String DFA9_minS =
		"\1\11\2\154\1\146\1\145\1\157\1\150\1\uffff\1\56\1\uffff\1\52\3\uffff"+
		"\1\75\1\uffff\2\75\6\uffff\1\163\1\157\1\60\2\164\2\151\13\uffff\1\145"+
		"\1\141\1\uffff\1\60\1\165\1\144\1\154\1\60\1\164\1\uffff\1\162\1\60\1"+
		"\145\1\uffff\1\60\1\156\1\uffff\1\60\1\uffff\1\60\2\uffff";
	static final String DFA9_maxS =
		"\1\175\2\154\1\156\1\145\1\157\1\150\1\uffff\1\71\1\uffff\1\57\3\uffff"+
		"\1\75\1\uffff\2\75\6\uffff\1\163\1\157\1\172\2\164\2\151\13\uffff\1\145"+
		"\1\141\1\uffff\1\172\1\165\1\144\1\154\1\172\1\164\1\uffff\1\162\1\172"+
		"\1\145\1\uffff\1\172\1\156\1\uffff\1\172\1\uffff\1\172\2\uffff";
	static final String DFA9_acceptS =
		"\7\uffff\1\10\1\uffff\1\13\1\uffff\1\16\1\17\1\20\1\uffff\1\24\2\uffff"+
		"\1\31\1\32\1\33\1\34\1\35\1\36\7\uffff\1\11\1\12\1\14\1\15\1\21\1\22\1"+
		"\23\1\27\1\25\1\30\1\26\2\uffff\1\3\6\uffff\1\4\3\uffff\1\1\2\uffff\1"+
		"\6\1\uffff\1\2\1\uffff\1\7\1\5";
	static final String DFA9_specialS =
		"\100\uffff}>";
	static final String[] DFA9_transitionS = {
			"\2\11\2\uffff\1\11\22\uffff\1\11\1\17\6\uffff\1\22\1\23\1\15\1\13\1\27"+
			"\1\14\1\uffff\1\12\12\10\1\uffff\1\26\1\20\1\16\1\21\2\uffff\32\7\6\uffff"+
			"\4\7\1\1\1\2\2\7\1\3\10\7\1\4\3\7\1\5\1\6\3\7\1\24\1\uffff\1\25",
			"\1\30",
			"\1\31",
			"\1\32\7\uffff\1\33",
			"\1\34",
			"\1\35",
			"\1\36",
			"",
			"\1\40\1\uffff\12\10",
			"",
			"\1\42\4\uffff\1\41",
			"",
			"",
			"",
			"\1\44",
			"",
			"\1\46",
			"\1\50",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\52",
			"\1\53",
			"\12\7\7\uffff\32\7\4\uffff\1\7\1\uffff\32\7",
			"\1\55",
			"\1\56",
			"\1\57",
			"\1\60",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\61",
			"\1\62",
			"",
			"\12\7\7\uffff\32\7\4\uffff\1\7\1\uffff\32\7",
			"\1\64",
			"\1\65",
			"\1\66",
			"\12\7\7\uffff\32\7\4\uffff\1\7\1\uffff\32\7",
			"\1\70",
			"",
			"\1\71",
			"\12\7\7\uffff\32\7\4\uffff\1\7\1\uffff\32\7",
			"\1\73",
			"",
			"\12\7\7\uffff\32\7\4\uffff\1\7\1\uffff\32\7",
			"\1\75",
			"",
			"\12\7\7\uffff\32\7\4\uffff\1\7\1\uffff\32\7",
			"",
			"\12\7\7\uffff\32\7\4\uffff\1\7\1\uffff\32\7",
			"",
			""
	};

	static final short[] DFA9_eot = DFA.unpackEncodedString(DFA9_eotS);
	static final short[] DFA9_eof = DFA.unpackEncodedString(DFA9_eofS);
	static final char[] DFA9_min = DFA.unpackEncodedStringToUnsignedChars(DFA9_minS);
	static final char[] DFA9_max = DFA.unpackEncodedStringToUnsignedChars(DFA9_maxS);
	static final short[] DFA9_accept = DFA.unpackEncodedString(DFA9_acceptS);
	static final short[] DFA9_special = DFA.unpackEncodedString(DFA9_specialS);
	static final short[][] DFA9_transition;

	static {
		int numStates = DFA9_transitionS.length;
		DFA9_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA9_transition[i] = DFA.unpackEncodedString(DFA9_transitionS[i]);
		}
	}

	protected class DFA9 extends DFA {

		public DFA9(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 9;
			this.eot = DFA9_eot;
			this.eof = DFA9_eof;
			this.min = DFA9_min;
			this.max = DFA9_max;
			this.accept = DFA9_accept;
			this.special = DFA9_special;
			this.transition = DFA9_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | ID | INT | FLOAT | WS | COMMENT | MULTICOMMENT | PLUS | MINUS | MUL | DIV | EQ | ASSIGN | NE | LT | GT | LE | GE | LPAREN | RPAREN | LBRACE | RBRACE | SEMI | COMMA );";
		}
	}

}
