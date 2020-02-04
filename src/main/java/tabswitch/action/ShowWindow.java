package tabswitch.action;


import tabswitch.filefetcher.OpenTabFilesFileFetcher;

public class ShowWindow extends ChangeTabAction {

    protected ShowWindow() { super(new OpenTabFilesFileFetcher()); }
}
