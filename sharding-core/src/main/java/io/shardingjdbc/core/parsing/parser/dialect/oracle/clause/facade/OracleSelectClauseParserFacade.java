/*
 * Copyright 1999-2015 dangdang.com.
 * <p>
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * </p>
 */

package io.shardingjdbc.core.parsing.parser.dialect.oracle.clause.facade;

import io.shardingjdbc.core.parsing.lexer.LexerEngine;
import io.shardingjdbc.core.parsing.parser.clause.HavingClauseParser;
import io.shardingjdbc.core.parsing.parser.clause.SelectRestClauseParser;
import io.shardingjdbc.core.parsing.parser.clause.facade.AbstractSelectClauseParserFacade;
import io.shardingjdbc.core.parsing.parser.dialect.oracle.clause.OracleDistinctClauseParser;
import io.shardingjdbc.core.parsing.parser.dialect.oracle.clause.OracleGroupByClauseParser;
import io.shardingjdbc.core.parsing.parser.dialect.oracle.clause.OracleOrderByClauseParser;
import io.shardingjdbc.core.parsing.parser.dialect.oracle.clause.OracleSelectListClauseParser;
import io.shardingjdbc.core.parsing.parser.dialect.oracle.clause.OracleTableReferencesClauseParser;
import io.shardingjdbc.core.parsing.parser.dialect.oracle.clause.OracleWhereClauseParser;
import io.shardingjdbc.core.rule.ShardingRule;

/**
 * Select clause parser facade for Oracle.
 *
 * @author zhangliang
 */
public final class OracleSelectClauseParserFacade extends AbstractSelectClauseParserFacade {
    
    public OracleSelectClauseParserFacade(final ShardingRule shardingRule, final LexerEngine lexerEngine) {
        super(new OracleDistinctClauseParser(lexerEngine), new OracleSelectListClauseParser(shardingRule, lexerEngine),
                new OracleTableReferencesClauseParser(shardingRule, lexerEngine), new OracleWhereClauseParser(lexerEngine), new OracleGroupByClauseParser(lexerEngine),
                new HavingClauseParser(lexerEngine), new OracleOrderByClauseParser(lexerEngine), new SelectRestClauseParser(lexerEngine));
    }
}
