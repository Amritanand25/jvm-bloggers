package pl.tomaszdziurko.jvm_bloggers.view.front_end;

import org.apache.wicket.Component;
import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.request.mapper.parameter.PageParameters;

import pl.tomaszdziurko.jvm_bloggers.view.front_end.common_layout.FooterFrontend;
import pl.tomaszdziurko.jvm_bloggers.view.front_end.common_layout.HeaderFrontend;
import pl.tomaszdziurko.jvm_bloggers.view.front_end.common_layout.RightFrontendSidebar;

public abstract class AbstractFrontendPage extends WebPage {

    public AbstractFrontendPage() {
        this(null);
    }

    public AbstractFrontendPage(PageParameters parameters) {
        super(parameters);

        add(createHeader());
        add(createRightSidebar());
        add(createFooter());
    }

    private Component createHeader() {
        return new HeaderFrontend("headerFrontend");
    }

    private Component createRightSidebar() {
        return new RightFrontendSidebar("rightSidebar");
    }

    private Component createFooter() {
        return new FooterFrontend("footer");
    }

}
