package thaobcph28911.fpoly.luyentapbaithi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class userAdapter extends BaseAdapter
{
    private ArrayList<user> list;
    private Context mContext;
    private userInterface userInterface;
    public userAdapter(Context mContext,userInterface userInterface){
        this.mContext=mContext;
        this.userInterface=userInterface;
    }
    public void setData(ArrayList<user>list){
        this.list = list;
        notifyDataSetChanged();
    }
    public static class UserViewHolder{
        private ImageView delete;
        private TextView tvaddress;
        private TextView tvname;
        private ImageView people;
    }

    @Override
    public int getCount() {
        if(list!=null){
            return list.size();
        }
        return 0;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        UserViewHolder viewHolder = null;
        if(view==null){
            viewHolder = new UserViewHolder();
            LayoutInflater inflater = (LayoutInflater) mContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.layout_item,null);
            viewHolder.people=view.findViewById(R.id.idpeople);
            viewHolder.tvaddress=view.findViewById(R.id.hoten);
            viewHolder.tvname=view.findViewById(R.id.diachi);
            viewHolder.delete=view.findViewById(R.id.delete);
            view.setTag(viewHolder);
        }else{
            viewHolder=(UserViewHolder) view.getTag();
        }
        viewHolder.tvname.setText(list.get(i).getName());
        viewHolder.tvaddress.setText(list.get(i).getAddress());
        viewHolder.people.setImageResource(list.get(i).getImg());
        viewHolder.delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                userInterface.onClickDelete(i);
            }
        });


        return view;
    }
}
