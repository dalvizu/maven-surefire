package org.apache.maven.plugins.surefire.report.stubs;

/*
 * Copyright 2001-2005 The Apache Software Foundation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

import org.apache.maven.plugin.testing.stubs.MavenProjectStub;
import org.apache.maven.model.Model;
import org.apache.maven.model.Reporting;
import org.apache.maven.model.ReportPlugin;

import java.util.List;
import java.util.ArrayList;

/**
 * @author <a href="mailto:aramirez@apache.org">Allan Ramirez</a>
 */
public class SurefireRepMavenProjectStub2
    extends MavenProjectStub
{
    public List getReportPlugins()
    {
        return new ArrayList();
    }
}