package com.example.stagepeoplin;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

// Create the basic adapter extending from RecyclerView.Adapter
// Note that we specify the custom ViewHolder which gives us access to our views
public class ClientsAdapter extends
        RecyclerView.Adapter<ClientsAdapter.ViewHolder> {
    Context context;

    // Provide a direct reference to each of the views within a data item
    // Used to cache the views within the item layout for fast access
    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        // Your holder should contain a member variable
        // for any view that will be set as you render a row
 /*       public TextView chapterNameTV;
        public TextView chapterLinkTV;
        public ImageView chapterIconTV;*/


        // We also create a constructor that accepts the entire item row
        // and does the view lookups to find each subview
        public ViewHolder(View itemView) {
            // Stores the itemView in a public final member variable that can be used
            // to access the context from any ViewHolder instance.
            super(itemView);
           /* chapterNameTV = (TextView) itemView.findViewById(R.id.chapter_name);
            chapterLinkTV = (TextView) itemView.findViewById(R.id.course_name);
            chapterIconTV = (ImageView) itemView.findViewById(R.id.icon);*/
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {

            // Toast.makeText(context, "Clicked on position: " + staticData.chosenChapterModel.get(getAdapterPosition()).getChapterLink(), Toast.LENGTH_SHORT).show();

           /* if(staticData.chosenChapterModel.get(getAdapterPosition()).getIcon().equalsIgnoreCase("pdf")){
               // Toast.makeText(context, "This is a PDF File", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(context, PdfViewerActivity.class);
                intent.putExtra("PDF_LINK", staticData.chosenChapterModel.get(getAdapterPosition()).getChapterLink());
                intent.putExtra("URL_TYPE", staticData.chosenChapterModel.get(getAdapterPosition()).getIcon());
                context.startActivity(intent);
            }else {
                staticData.openUrlInBrowser(context,staticData.chosenChapterModel.get(getAdapterPosition()).getChapterLink());
            }*/
            /*if (staticData.chosenChapterModel.get(getAdapterPosition()).getIcon().equalsIgnoreCase("Youtube")) {
                staticData.openUrlInBrowser(context, staticData.chosenChapterModel.get(getAdapterPosition()).getChapterLink());
            } else {
                Intent intent = new Intent(context, PdfViewerActivity.class);
                intent.putExtra("PDF_LINK", staticData.chosenChapterModel.get(getAdapterPosition()).getChapterLink());
                intent.putExtra("URL_TYPE", staticData.chosenChapterModel.get(getAdapterPosition()).getIcon());
                context.startActivity(intent);
            }*/

        }
    }

    // Store a member variable for the contacts
    private List<Integer> mChapterModels;

    // Pass in the contact array into the constructor
    public ClientsAdapter(List<Integer> chapterModels) {
        mChapterModels = chapterModels;
    }

    // Usually involves inflating a layout from XML and returning the holder
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        context = parent.getContext();
        LayoutInflater inflater = LayoutInflater.from(context);

        // Inflate the custom layout
        View contactView = inflater.inflate(R.layout.item_client, parent, false);

        // Return a new holder instance
        ViewHolder viewHolder = new ViewHolder(contactView);
        return viewHolder;
    }

    // Involves populating data into the item through holder
    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        // Get the data model based on position
        /*ChapterModel chapterModel = mChapterModels.get(position);*/

        // Set item views based on your views and data model
        /*TextView chapterName = holder.chapterNameTV;
        chapterName.setText(chapterModel.getChapterName());
        TextView chapterLink = holder.chapterLinkTV;
        chapterLink.setText(chapterModel.getCourseName());
        ImageView chapterIconIM = holder.chapterIconTV;
        if (chapterModel.getIcon().equalsIgnoreCase("youtube")) {
            //Youtube
            chapterIconIM.setImageResource(R.drawable.youtube);
        }
        if (chapterModel.getIcon().equalsIgnoreCase("pdf")) {
            //PDF
            chapterIconIM.setImageResource(R.drawable.pdf_icon);
        }
        if (chapterModel.getIcon().equalsIgnoreCase("site")) {
            //PDF
            chapterIconIM.setImageResource(R.drawable.web);
        }*/


    }

    // Returns the total count of items in the list
    @Override
    public int getItemCount() {
        return mChapterModels.size();
    }
}